package space.axolab.axogram;

public interface GenericProvider<F, T> {
    T provide(F obj);
}
