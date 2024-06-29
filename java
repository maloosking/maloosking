const me = {
    name: "TSolutionsX",
    eatsAppleDaily: false,
    printAbout: function() {
        console.log(`I am ${this.name}. I ${this.eatsAppleDaily ? "eat" : "don't eat"} apple daily.`);
    }
};

const myFriend = Object.create(me);
myFriend.name = "Ladoo";
myFriend.eatsAppleDaily = true;

me.printAbout();        // Output: I am TSolutionsX. I don't eat apple daily.
myFriend.printAbout();  // Output: I am Ladoo. I eat apple daily.