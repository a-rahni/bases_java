package PrincipesSOLID.exos_solid;

// 1. Commencer par critiquer le code écrit en mettant en avant les problèmes
    // segregation d'interface: certaines methodes ne sont pas applicable dans des classes filles mais elles
    // sont obliger de les redefinir car sont de fct abstraites
    //
// 2. Proposer une solution
    // vue que ces fonctions decrit des comportement qui n'est pas toujours applicable dans les classes filles
    // alors mieux d'utiliser une interface pour chaque methode.

// 3. Regarder attentivement la méthode main.Est-ce que c'est cohérent de typer toutes
// ces sous classes selon leurs parent
    // oui, le principe de liskov substitution.
public class Case2 {
    public static void main(String[] args) {
        SocialMedia whatsapp=new Whatsapp();
        SocialMedia instagram=new Instagram();
        SocialMedia facebook=new Facebook();
    }
}

abstract class SocialMedia {

    //@support WhatsApp,Facebook,Instagram
    public abstract  void chatWithFriend();

    //@support Facebook,Instagram
    public abstract void publishPost(Object post);

    //@support WhatsApp,Facebook,Instagram
    public abstract  void sendPhotosAndVideos();

    //@support WhatsApp,Facebook
    public abstract  void groupVideoCall(String... users);
}


class Facebook extends SocialMedia {

    public void chatWithFriend() {

    }

    public void publishPost(Object post) {

    }

    public void sendPhotosAndVideos() {

    }

    public void groupVideoCall(String... users) {

    }
}


class Instagram extends SocialMedia {

    public void chatWithFriend() {

    }

    public void publishPost(Object post) {

    }

    public void sendPhotosAndVideos() {

    }

    public void groupVideoCall(String... users) {
//not applicable
    }
}


class Whatsapp extends SocialMedia {
    public void chatWithFriend() {

    }

    public void publishPost(Object post) {
//Not applicable
    }

    public void sendPhotosAndVideos() {

    }

    public void groupVideoCall(String... users) {

    }
}