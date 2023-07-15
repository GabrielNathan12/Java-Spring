package com.intensicaojavaspring.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intensicaojavaspring.demo.dto.GameListDTO;
import com.intensicaojavaspring.demo.entities.GameList;
import com.intensicaojavaspring.demo.projection.GameMinProjection;
import com.intensicaojavaspring.demo.repositories.GameListRepository;
import com.intensicaojavaspring.demo.repositories.GameRepository;

@Service
public class GameListService {
    
    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
        public List<GameListDTO> findAll(){
            List<GameList> result = gameListRepository.findAll();
            return result.stream().map(x -> new GameListDTO(x)).toList();
            
        }
    @Transactional
        public void move(Long listId, int sourceIndex, int destinationIndex){
            List<GameMinProjection> result = gameRepository.searchByList(listId);
            GameMinProjection obj = result.remove(sourceIndex);
            result.add(destinationIndex, obj);
            int min = sourceIndex < destinationIndex ? sourceIndex:destinationIndex;
            int max = sourceIndex  < destinationIndex ? destinationIndex : sourceIndex;

            for(int i = min; i <= max; i++){
                gameListRepository.updateBelongingPosition(listId, result.get(i).getId(), i);
            }
        }
}
