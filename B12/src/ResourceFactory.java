public class ResourceFactory {
    public static Resource createResource(String type, String content) {
        if (type.equalsIgnoreCase("news")) {
            return new News(content);
        } else if (type.equalsIgnoreCase("blog")) {
            return new Blog(content);
        }
        throw new IllegalArgumentException("Unknown resource type");
    }
}