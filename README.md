# DijkstraShortestPathSolver


This project has simple API interface where you put as input the target node and your graph in JSON format and it gives back shortest path through nodes with their values


HOW TO RUN THE APP LOCALLY

1) Make sure you're running JDK 1.8+
2) Open the project --> do the mvn install commands
3) Run the app with springboot configuration
4) If the app is running you should be abble to see it on url: http://localhost:8081/swagger-ui.html#/


Sample input to App

Target Node: E


JSON input 

{
  "destinationsList": [
    {
      "destination": "B",
      "distance": 10,
      "origin": "A"
    },
    {
      "destination": "C",
      "distance": 15,
      "origin": "A"
    },
    {
      "destination": "D",
      "distance": 12,
      "origin": "B"
    },
    {
      "destination": "F",
      "distance": 15,
      "origin": "B"
    },
    {
      "destination": "E",
      "distance": 10,
      "origin": "C"
    },
    {
      "destination": "E",
      "distance": 2,
      "origin": "D"
    },
    {
      "destination": "F",
      "distance": 1,
      "origin": "D"
    },
    {
      "destination": "E",
      "distance": 5,
      "origin": "F"
    }
  ],
  "listOfNodes": [
    "A","B","C","D","E","F"
  ]
}


Expected output: [ A,0 ] -->  [ B,10 ] -->  [ D,22 ] -->  [ E,24 ]
