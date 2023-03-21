import java.util.List;

import ca.mcmaster.cas.se2aa4.a2.io.Structs.Mesh;
import ca.mcmaster.cas.se2aa4.a2.io.Structs.Polygon;

public class Extractor {
    private Mesh aMesh;

    public Extractor(Mesh aMesh){
        this.aMesh = aMesh;
    }    

    public MyMesh convert(){
        MyMesh newMesh = new MyMesh();

        newMesh.setSegments(aMesh.getSegmentsList());
        newMesh.setVertexs(aMesh.getVerticesList());

        List <Polygon> polygons = this.aMesh.getPolygonsList();

        int i = 0;
        for(Polygon p : polygons){
            newMesh.addPolygon(convertPolygon(p, i));
            i++;
        }

        return newMesh;
    }

    private MyPolygon convertPolygon(Polygon p, int id) {
        MyPolygon polygon = new MyPolygon();

        polygon.setId(id);

        List <Integer> neighbours = p.getNeighborIdxsList();
        polygon.setNeighbours(neighbours);
        
        polygon.setCentroidId(p.getCentroidIdx());
        
        polygon.setSegments(p.getSegmentIdxsList());

        return polygon;
    }
}
