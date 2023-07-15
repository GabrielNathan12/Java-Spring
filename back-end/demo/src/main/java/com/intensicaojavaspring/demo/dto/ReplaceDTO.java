package com.intensicaojavaspring.demo.dto;

public class ReplaceDTO {
    private Integer sourceIndex;
    private Integer destinationIndex;


    public void setSourceIndex(Integer sourceIndex){
        this.sourceIndex = sourceIndex;
    }
    
    public void setDestinationIndex(Integer destinationIndex){
        this.destinationIndex = destinationIndex;
    }
    public Integer getDestinationIndex(){
        return destinationIndex;
    }
    public Integer getSourceIndex(){
        return sourceIndex;
    }
}
