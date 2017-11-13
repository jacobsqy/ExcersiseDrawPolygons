import java.util.List;

public class TestSubtyping {
  Polygon[] polArray;
  Triangle[] triArray;
  List<Polygon> polList;
  List<Triangle> triList;

  public void main(String[] args) {
    polArray = new Polygon[3];
    triArray = new Triangle[3];

    polArray[0] = new Triangle(1, 1);
    // polArray[1] = new Object();

    // triArray[0] = new Object();
    triArray[1] = new Triangle(1,1);
    // triArray[2] = new Polygon();

    polList.add(new Triangle(1,1));
    // polList.add(new Polygon());
    // polList.add(new Object());

    triList.add(new Triangle(1,1));
    // triList.add(new Polygon());
    // triList.add(new Object());

    // polList = triList; // does not work
    polArray = triArray; //does work!
  }

}
