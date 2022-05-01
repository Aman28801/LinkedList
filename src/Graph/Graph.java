package Graph;

import java.util.HashMap;

public class Graph {
    private class Vertex{
        HashMap<String,Integer> nbrs = new HashMap<>();

    }
    HashMap<String,Vertex> vrtcs;

    public Graph(){
        vrtcs = new HashMap<>();
    }
    public int numVertex(){
        return this.vrtcs.size();
    }
    public void addVertex(String vname){
        Vertex vtx =new Vertex();
        vrtcs.put(vname,vtx);
    }
    public boolean ContainsVertex(String vname){
        return this.vrtcs.containsKey(vname);
    }

}
