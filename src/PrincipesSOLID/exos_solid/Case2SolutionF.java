package PrincipesSOLID.exos_solid;

public class Case2SolutionF {
    public static void main(String[] args) {
//        SocialMedia1 whatsapp=new Whatsapp1();
//        SocialMedia1 instagram=new Instagram1();
//        SocialMedia1 facebook=new Facebook1();

        WhatsApp1 whatsapp = new WhatsApp1();
        whatsapp.chatWithFriend();

    }
}

 interface SocialMedia1 {

    public   void chatWithFriend();

    public   void sendPhotosAndVideos();

}

 interface PostMediaManager1 {

    public  void publishPost(Object post);
}

 interface SocialVideoCallManager1 {
    public void groupVideoCall(String... users);
}

 class Instagram1 implements SocialMedia1,PostMediaManager1{

    public void publishPost(Object post) {

    }

    public void chatWithFriend() {

    }

    public void sendPhotosAndVideos() {

    }
}

 class WhatsApp1 implements SocialMedia1,SocialVideoCallManager1 {
    public void chatWithFriend() {

    }

    public void sendPhotosAndVideos() {

    }

    public void groupVideoCall(String... users) {

    }
}

 class Facebook1 implements SocialMedia1, SocialVideoCallManager1,PostMediaManager1{

    public void chatWithFriend() {

    }

    public void publishPost(Object post) {

    }

    public void sendPhotosAndVideos() {

    }

    public void groupVideoCall(String... users) {

    }
}