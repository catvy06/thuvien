package Configs;

public class IService<T, E> extends AddScoped<T, E>{

    public IService(Class<T> type, Class<E> obj) {
        super(type, obj);
    }
}
