package Model;

public class Listitem {
    private String name;
    private String description;
    private String remarks;
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

     public Listitem(String name, String description, String remarks) {
        this.name = name;
         this.description = description;
this.remarks = remarks;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




}
