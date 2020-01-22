package com.example.funfacts;

import java.util.Random;

public class FactBook {

    String[] strings = {
            "Banging your head against a wall for one hour burns 150 calories.",
            "In Switzerland it is illegal to own just one guinea pig.",
            "Pteronophobia is the fear of being tickled by feathers.",
            "Snakes can help predict earthquakes.",
            "A flock of crows is known as a murder.",
            "The oldest “your mom” joke was discovered on a 3,500 year old Babylonian tablet.",
            "So far, two diseases have successfully been eradicated: smallpox and rinderpest.",
            "29th May is officially “Put a Pillow on Your Fridge Day”.",
            "Cherophobia is an irrational fear of fun or happiness.",
            "7% of American adults believe that chocolate milk comes from brown cows.",
            "If you lift a kangaroo’s tail off the ground it can’t hop.",
            "Bananas are curved because they grow towards the sun.",
            "Billy goats urinate on their own heads to smell more attractive to females.",
            "The inventor of the Frisbee was cremated and made into a Frisbee after he died.",
            "During your lifetime, you will produce enough saliva to fill two swimming pools.",
            "If Pinocchio says “My Nose Will Grow Now”, it would cause a paradox.",
            "Polar bears could eat as many as 86 penguins in a single sitting…",
            "King Henry VIII slept with a gigantic axe beside him.",
            "Movie trailers were originally shown after the movie, which is why they were called “trailers”.",
            "An eagle can kill a young deer and fly away with it.",
            "Heart attacks are more likely to happen on a Monday.",
            "Tennis players are not allowed to swear when they are playing in Wimbledon.",
            "In 2017 more people were killed from injuries caused by taking a selfie than by shark attacks.",
            "The top six foods that make your fart are beans, corn, bell peppers, cauliflower, cabbage and milk.",
            "There is a species of spider called the Hobo Spider.",
            "A lion’s roar can be heard from 5 miles away.",
            "Saint Lucia is the only country in the world named after a woman.",
            "A baby spider is called a spiderling.",
            "The United States Navy has started using Xbox controllers for their periscopes.",
            "The following can be read forward and backwards: Do geese see God?",
            "A baby octopus is about the size of a flea when it is born.",
            "A sheep, a duck and a rooster were the first passengers in a hot air balloon.",
            "In Uganda, around 48% of the population is under 15 years of age.",
            "The average male gets bored of a shopping trip after 26 minutes.",
            "In the 16th Century, Arab women could initiate a divorce if their husbands didn’t pour coffee for them.",
            "Recycling one glass jar saves enough energy to watch television for 3 hours.",
            "After the premiere of “16 and Pregnant,” teen pregnancy rates dropped.",
            "Approximately 10-20% of U.S. power outages are caused by squirrels.",
            "Facebook, Instagram and Twitter are all banned in China.",
            "95% of people text things they could never say in person."
    };





    public String getFact() {
        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(strings.length);

        fact = strings[randomNumber];

        return fact;
    }
}
