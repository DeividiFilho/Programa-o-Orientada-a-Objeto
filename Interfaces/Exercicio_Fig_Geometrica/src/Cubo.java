public class Cubo implements IFiguraPlana, IFiguraTridimensional{
    private double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.getAresta(),2)*6;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(this.getAresta(), 3);
    }
}

