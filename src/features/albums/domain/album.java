package features.albums.domain;

public class album {

    private String id;
    private String name;
    private String publicationYear;


    public album(String id, String name, String publicationYear) {
        this.id = id;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }
}
