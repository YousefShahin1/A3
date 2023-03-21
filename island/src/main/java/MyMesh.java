import java.util.ArrayList;
import java.util.List;
import ca.mcmaster.cas.se2aa4.a2.io.Structs.Segment;
import ca.mcmaster.cas.se2aa4.a2.io.Structs.Vertex;

public class MyMesh {
    private List <MyPolygon> polygons;
    private List <Segment> segments;
    private List <Vertex> vertexs;

    public MyMesh (){
        polygons = new ArrayList<>();
    }

    public void addPolygon(MyPolygon p){
        polygons.add(p);
    }

    public List<MyPolygon> getPolygons() {
        return new ArrayList<>(polygons);
    }

    public void setPolygons(List<MyPolygon> polygons) {
        this.polygons = new ArrayList<>(polygons);
    }

    public void setVertexs(List <Vertex> vertexs){
        this.vertexs = vertexs;
    }

    public List <Vertex> getVertexs(){
        return this.vertexs;
    }

    public void setSegments(List <Segment> segments){
        this.segments = segments;
    }

    public List <Segment> getSegments(){
        return this.segments;
    }
}
