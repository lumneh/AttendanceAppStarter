package repositories;

//import java.util.function.Predicate;
//import model.Swipe;


/*public class Repository implements RepositoryInterface {
    private CollectionChoice<Swipe> items;    
    
    public Repository() {
        this.items = new CollectionChoiceImplementation<>();       
    }
    
    public Repository(CollectionChoice<Swipe> items) {        
        this.items = items;
    }
    
    public Repository(String filename) {
        this();
        // Create dao and execute load  
    }
    
    @Override
    public CollectionChoice<Swipe> getItems() {        
        return this.items;
    }
    
    @Override
    public void setItems(CollectionChoice<Swipe> items) {        
        this.items = items;
    }
    
    @Override
    public void add(Swipe item) {
        this.items.add(item);
    }
       
    @Override
    public void remove(int id) {
        Predicate<Swipe> predicate = e->e.getId() == id;       
        this.items.removeIf(predicate);
    }
    
    @Override
    public Swipe getItem(int id) {
        for (Swipe item:this.items) {
            if (item.getId() == id)
                return item;
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "\nItems: " + this.items;
    }    
    
    @Override
    public void store(String filename) {       
        // create dao and execute store    
    }        
}*/
