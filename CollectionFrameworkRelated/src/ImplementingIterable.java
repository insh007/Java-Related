public class ImplementingIterable {
    public static void main(String[] args){
        UrlLibrary urlLibrary = new UrlLibrary();

        for(String html : urlLibrary){
            System.out.println(html.length());
//            System.out.println(html);
        }

//        for(String url : urlLibrary){
//            System.out.println(url);
//        }

    }
}
