package com.graph;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Un-directed Graph with no loops.
public class Graph_Goodrich {

    HashMap<Integer,Vertex> vertexContainer = new HashMap<Integer, Vertex>();
    List<Edge> edgeContainer = new LinkedList<Edge>();

    public static void main(String[] args) {
        Graph_Goodrich graph = new Graph_Goodrich();
        graph.readGraph();
    }

    void readGraph() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("/tmp/graph1")));
            String line;
            Pattern pattern = Pattern.compile("(\\d+)\\s+(\\d+)");
            try {
                line = reader.readLine();
                int num_vertices = Integer.parseInt(line);
                line = reader.readLine();
                int num_edges = Integer.parseInt(line);
                int i = 0;
                while(i<num_edges) {
                    line = reader.readLine();
                    Matcher matcher = pattern.matcher(line);

                    if(matcher.matches()) {
                        int vertex_num1 = Integer.parseInt(matcher.group(1));
                        int vertex_num2 = Integer.parseInt(matcher.group(2));

                        Vertex vertex1 = new Vertex(vertex_num1);
                        Vertex vertex2 = new Vertex(vertex_num2);
                        vertexContainer.put(vertex_num1,vertex1);
                        vertexContainer.put(vertex_num2,vertex2);
                        Edge edge = new Edge(vertex1,vertex2);
                        vertex1.adjacencyList.add(edge);
                        vertex2.adjacencyList.add(edge);
                        edgeContainer.add(edge);
                    }

                    i++;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Depth first search
    private void dfs(int vertex,Set<Integer> visited, List<Edge> backEdges,  List<Edge>  discoveryEdges, Set<Edge> explored) {
        visited.add(vertex);
        Iterator<Edge> iterator = vertexContainer.get(vertex).adjacencyList.iterator();
        while(iterator.hasNext()) {
            Edge edge = iterator.next();
            if(!explored.contains(edge)){
                explored.add(edge);
                Vertex otherEnd = edge.getOtherEnd(vertexContainer.get(vertex));
                if(visited.contains(otherEnd))
                    backEdges.add(edge);
                else{
                    discoveryEdges.add(edge);
                    dfs(otherEnd.number,visited,backEdges,discoveryEdges,explored); //TODO : Is it possible to write non-recursively?
                }
            }
        }
    }

    private void bfs(Stack<Vertex> stack,Set<Vertex> visited,List<Edge> backEdges,List<Edge> discoveryEdges,Set<Edge> explored){
        Stack<Vertex> nStack = new Stack<Vertex>();
        for(Vertex v : stack) {
            Iterator<Edge> iterator = vertexContainer.get(v.number).adjacencyList.iterator();
            while(iterator.hasNext()){
                Edge edge = iterator.next();
                if(!explored.contains(edge)){
                    explored.add(edge);
                    Vertex otherEnd = edge.getOtherEnd(v);
                    if(visited.contains(otherEnd)){
                        backEdges.add(edge);
                    }else{
                        discoveryEdges.add(edge);
                        visited.add(otherEnd);
                    }
                    nStack.add(otherEnd);
                }
            }
        }
        bfs(nStack,visited,backEdges,discoveryEdges,explored);
    }

    static class Edge {
        Vertex vertex1, vertex2;
        int data;

        Edge(Vertex vertex1,Vertex vertex2) {
            this.vertex1 = vertex1;
            this.vertex2 = vertex2;
        }

        Vertex getOtherEnd(Vertex vertex){
            if(vertex1.equals(vertex))
                return vertex2;
            else if(vertex2.equals(vertex))
                return vertex1;
            else
                throw new RuntimeException("Given vertex doesn't belong to this edge");
        }
    }

    static class Vertex {
        int number;
        PriorityQueue<Edge> adjacencyList = new PriorityQueue<>();

        Vertex(int number) {
            this.number = number;
        }

        @Override
        public boolean equals(Object obj) {
            if(! (obj instanceof Vertex)) {
                return false;
            }else{
                Vertex vertex = (Vertex)obj;
                return vertex.number == number;
            }
        }
    }
    //Breadth First Search
}

