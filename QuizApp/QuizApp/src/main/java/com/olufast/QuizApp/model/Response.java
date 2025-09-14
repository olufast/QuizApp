package com.olufast.QuizApp.model;

public class Response {
    private Integer Id;
    private String response;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Respose{" +
                "Id=" + Id +
                ", response='" + response + '\'' +
                '}';
    }

    public Response(Integer id, String response) {
        Id = id;
        this.response = response;
    }

    public Response() {
    }
}
