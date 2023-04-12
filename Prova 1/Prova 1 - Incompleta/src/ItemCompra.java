import java.util.*;

public class ItemCompra implements List<ItemCompra> {
    private int qtddComprada;
    private double valorTotal;
    private List<Produto>produto = new ArrayList<>();

    public ItemCompra(int qtddComprada, int valorTotal, String Produto) {
    }

    public void calcularValorTotal(int qtddComprada, double valorTotal){
        System.out.println("O valor total é: " + qtddComprada * valorTotal);
    }

    public ItemCompra(int qtddComprada, double valorTotal, List<Produto> produto) {
        this.qtddComprada = qtddComprada;
        this.valorTotal = valorTotal;
        this.produto = produto;
    }

    public int getQtddComprada() {
        return qtddComprada;
    }

    public void setQtddComprada(int qtddComprada) {
        this.qtddComprada = qtddComprada;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    // Não entendi, mas tava dando erro no main e o IDE sugeriu isso. Resolveu o problemas, mas desconsidera
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<ItemCompra> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(ItemCompra itemCompra) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends ItemCompra> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends ItemCompra> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public ItemCompra get(int index) {
        return null;
    }

    @Override
    public ItemCompra set(int index, ItemCompra element) {
        return null;
    }

    @Override
    public void add(int index, ItemCompra element) {

    }

    @Override
    public ItemCompra remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<ItemCompra> listIterator() {
        return null;
    }

    @Override
    public ListIterator<ItemCompra> listIterator(int index) {
        return null;
    }

    @Override
    public List<ItemCompra> subList(int fromIndex, int toIndex) {
        return null;
    }
}
