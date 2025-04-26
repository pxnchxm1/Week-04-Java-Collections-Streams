public class ResourceCleanUp {
    public void open(){
        System.out.println("opened a resource");
    }
    public void use(){
        System.out.println("reading from resource.....");
        throw new RuntimeException("Error while using resource");
    }
    public void close(){
        System.out.println("resource closed ! ");
    }
    public static void main(String[] args) {
        ResourceCleanUp resource = new ResourceCleanUp();
        try{
            resource.open();
            resource.use();

        }catch(RuntimeException r){
            System.out.println("error while reading ! "+ r.getMessage());
        } finally{
            resource.close();
        }
    }

}
