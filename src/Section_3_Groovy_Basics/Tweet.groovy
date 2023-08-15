package Section_3_Groovy_Basics

class Tweet {
    String name;
    Integer likes_count;
    ArrayList<String> comments = []
    Date createdOn

    public ModeratorCheck() {
        if (this.name.contains("FUCK")) {
            println "Found bad word, BAN"
        }
        else {
            println "Welcome to our friendly and tolerance community 💖"
        }
    }

    public Tweet(String name) {
        this.name = name
        this.likes_count = 0
        this.createdOn = new Date()
        println "New tweet posted with the following contnet: \"${this.name}\""
        ModeratorCheck()
    }

    void Like() {
        this.likes_count++
    }

    void HowManyLikesDoIHave() {
        println "Dear user, you have: ${this.likes_count} likes"
    }

}


