import java.util.*;

public class Cliente extends Pessoa implements List<Cliente> {
    private String telefone;

    public Cliente(String cpf, String nome, String telefone) {
        super(cpf, nome);
        this.telefone = telefone;
    }

    public void exibirHistoricoDeCompras(){
        Date dataInicial;
        Date dataFinal;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
    public Iterator<Cliente> iterator() {
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
    public boolean add(Cliente cliente) {
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
    public boolean addAll(Collection<? extends Cliente> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Cliente> c) {
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
    public Cliente get(int index) {
        return null;
    }

    @Override
    public Cliente set(int index, Cliente element) {
        return null;
    }

    @Override
    public void add(int index, Cliente element) {

    }

    @Override
    public Cliente remove(int index) {
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
    public ListIterator<Cliente> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Cliente> listIterator(int index) {
        return null;
    }

    @Override
    public List<Cliente> subList(int fromIndex, int toIndex) {
        return null;
    }
}
