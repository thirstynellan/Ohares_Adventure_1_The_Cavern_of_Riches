package com.geoffdraper.ohare1;

public class SecretSauce {

    private Room startingLocation;
    private Room treasureRoom;
    private Room epilogue1;

    private boolean rugMoved = false;
    private boolean trapdoorOpen = false;
    private boolean bookcaseGone = false;
    private boolean bottleFull = false;
    private boolean plantBeenWatered = false;
    private boolean boxOpen = false;
    private boolean bearAsleep = false;
    private boolean birdcageEmpty = true;
    private boolean bridgeExists = false;
    private boolean bookRead = false;
    private boolean scrollRead = false;
    private boolean egyptSpoken = false;
    private boolean sesameSpoken = false;
    private boolean digOnce = false;
    private boolean digTwice = false;
    private boolean mistyPassageOpen = false;
    private boolean tastedTheFood = false;

    public SecretSauce(/*Player testing*/) {
        ////////////////////////////////
        // Here, we define all the rooms
        ////////////////////////////////
        var r1 = new Room("You are on a dusty path in a clearing. You see an old cabin to your east.");
        var r2 = new Room("You are in an old log cabin. You see a sign in the middle of the room that reads LEAVE *TREASURE* HERE. (Tap the \"Check Score\" option in your device's toolbar to see your score.)");
        var r3 = new Room("You are standing on a tall hill in the forest. There is a building in the distance.");
        var r4 = new Room("You are standing on the bank of a cold stream which bubbles playfully at your feet.");
        var r5 = new Room("You are in a thick forest, It's hard to see far in any direction.");
        var r6 = new Room("You are in a forest, The trees grow thick here. Visibility is limited.");
        var r7 = new Room("You have reached the end of the road. A small brick building lies to the south.");
        var r8 = new Room("You are in a deserted old building.");
        r8.setAdditionalDescription("A thick rug covers one corner of the floor.");
        var r9 = new Room("You're in a musty old basement.");
        r9.setAdditionalDescription("There is a heavy-looking bookcase here.");
        var r10 = new Room("You are in an underground cavern.");
        var r11 = new Room("You are in the Hall of Mists.");
        var r12 = new Room("You are at the west end of a deep chasm. There is a signpost here.");
        r12.setAdditionalDescription("The chasm appears to be impossible to pass.");
        var r13 = new Room("You are in a low damp room.");
        var r14 = new Room("You are at the east end of a deep chasm. A crystal bridge leads west and another passageway leads south.");
        var r15 = new Room("You are in a dirty passage. A feeling of magic pervades the air.");
        var r16 = new Room("You are in the Wizard's Chamber.");
        var r17 = new Room("You are in a large drafty room.");
        var r18 = new Room("You are in the Hall of the Cavern King.");
        r18.setAdditionalDescription("There is a low tunnel to the west which is guarded by a giant emerald-colored snake.");
        var r19 = new Room("You are in a pit.");
        r19.setAdditionalDescription("There is a huge boulder here, too heavy to move by your own power.");
        var r20 = new Room("You are in a cul-de-sac.");
        var r21 = new Room("You are in a gloomy cavern. An electric sphere floats above you, giving off an eerie blue light.");
        var r22 = new Room("You are in an ancient cavern.");
        var r23 = new Room("You are in the bear's chamber.");
        r23.setAdditionalDescription("A large bear paces back and forth, eying you hungrily. There is a hole in the east wall that looks big enough to enter, but not with that bear standing guard.");
        var r24 = new Room("You are in a muddy room. There is a signpost here which you can read.");
        var r25 = new Room("You are in an Oriental Room.");
        var r26 = new Room("You are in tight crawlspace.");
        var r27 = new Room("You are in a large cavern. A rickety old wooden shack stands to your west.");
        var r28 = new Room("You are in an old shack, long abandoned by its former occupants.");
        var r29 = new Room("You are in a moss-covered room. As you look up, you can see a hole in the ceiling, eight meters above.");
        r29.setAdditionalDescription("A withered-looking plant sits in a flowerpot. You can almost hear it murmuring, \"water, water...\"");
        var r30 = new Room("You are in the Giant's Chamber.");
        var r31 = new Room("You are standing on the rim of the Cavern Volcano. An impassable pool of lava stretches before you.");
        var r32 = new Room("You are in a trophy room.");
        var intro1 = new Room("""
                "And Uncle Bob gets... the stuffed platypus!!" your great-aunt squeals with a bit more enthusiasm than you think the situation merits.
                                
                You exhale loudly. The white elephant gift exchange is your least favorite part of the annual family Christmas party. All you got was a glass figurine of a bird. No one wanted to trade with you, so you got stuck with it. You look around to see if anyone else is as bored as you. As you do so, you notice that you haven't seen Grandpa John in a few minutes.
                """);
        var intro2 = new Room("""
                You sneak out of the family room and into the kitchen, where you find Grandpa dishing himself a bowl of ice cream. He looks up and smiles as he sees you.
                                
                "Jane O'Hare! My favorite granddaughter! Looks like you were enjoying the party as much as I was," he says. "Come on in; sit down and have some ice cream."
                                
                "Sure," you say as you pull up a chair.
                                
                "Now, what flavor would you like?" Grandpa asks.
                """);
        String mintChocolateChip = """
                "Mint chocolate chip, of course!" you say. "Is there any other flavor?"
                
                Grandpa chuckles. "You have your grandmother's tastes, I see."
                                
                """;
        String mackinacIslandFudge = """
                Grandpa nods approvingly. "Ah, Michigan's best. An excellent choice!"
                                
                """;
        var intro3 = new Room("""
                He dishes you up a bowl of ice cream. You eat in companionable silence for a minute or two, then Grandpa asks you if you got anything interesting from the white elephant gift exchange.
                                
                "Just this glass bird," you say, pulling it out of your pocket to show him.
                                
                Grandpa looks at the bird thoughtfully, as if regarding an old friend. "A bird like this once helped me out of a very tricky situation."
                                
                You look at him curiously.
                                
                Gazing dreamily into the distance, Grandpa slowly continues. "It was a long time ago, in a colossal cave. My old pals Crowther and Woods were the first to discover it, but I came along not long afterwards. Rumors spoke of magnificent treasures hidden in the cave, for those with enough cunning to retrieve them."
                                
                "Well, did you find any?"
                                
                Your question shakes Grandpa out of his reverie. "Did I find any what?"
                                
                "Treasures! In the cave? And what did a bird have to do with it?"
                                
                Suddenly, your mother bursts into the kitchen. "There you two are! You're missing the party!"
                                
                "Oh, Jane and I were just making sure the ice cream was still fresh. We'll be right there," Grandpa assures her.
                                
                Mom rolls her eyes good-naturedly and leaves the room.
                                
                Grandpa lowers his voice conspiratorially. "It's all written down in my book," he says. He pulls a leather-bound book out of his satchel and hands it to you.
                                
                "THE CAVERN OF RICHES by John O'Hare," you read the title on the cover. "Wait, you wrote a book?"
                                
                "Not just one. Here, I'll trade you: a book for a glass bird. What do you say?"
                """);
        String youTakeTheBook = """
                Eagerly, you trade your bird for Grandpa's book.
                                
                "You can read it when you get home," he nudges you towards the door. "We should get back to the party."
                
                An hour or so later, the party ends and your parents take you home.
                
                """;
        String youRefuseTheBook = """
                Grandpa nods understandingly. "Perhaps some other time," he says. "Anyway, we should get back to the party."
                
                """;
        String endOfParty = """
                An hour or so later, the party ends and your parents take you home. As you get out of the car, you notice a book under the seat. You pick it up and look at the cover: "THE CAVERN OF RICHES by John O'Hare."
                                
                "Oh, that's one of my dad's adventure books," your father tells you. "He probably meant it as a Christmas gift for you. Go ahead and take it inside the house."
                
                """;
        var intro4 = new Room("""
                You wash up and get ready for bed. As you snuggle into your blankets, you open up Grandpa's book and start to read...
                """);

        epilogue1 = new Room("""
                As you put the final treasure into its place, you hear a friendly voice call out, "Congratulations, you won!"
                                
                You look around. Who said that?
                                
                Suddenly, your surroundings change. You are no longer in the cavern; you are home in your bed. Grandpa John's book lies open on your lap. Were you reading it? Or dreaming it?
                
                You close the book and put it on your nightstand. As you roll over and try to sleep, you promise yourself that you will visit the Cavern of Riches again soon.
                
                This may have been your first, but it will not be your last O'HARE'S ADVENTURE!
               
                """);

        //which ones are outside? Mark them as such
        r1.markAsOutside();
        r2.markAsOutside();
        r3.markAsOutside();
        r4.markAsOutside();
        r5.markAsOutside();
        r6.markAsOutside();
        r7.markAsOutside();
        r8.markAsOutside();
        r9.markAsOutside();
        intro1.markAsOutside();
        intro2.markAsOutside();
        intro3.markAsOutside();
        intro4.markAsOutside();
        epilogue1.markAsOutside();

        ///////////////////////////////////////////////////////////////
        // Here, we state which locations lead to which other locations
        ///////////////////////////////////////////////////////////////
        r1.addExit(Direction.EAST, r2).addExit(Direction.SOUTH, r3);
        r2.addExit(Direction.WEST, r1);
        r3.addExit(Direction.NORTH, r1).addExit(Direction.SOUTH, r5).addExit(Direction.EAST, r4).addExit(Direction.WEST, r5);
        r4.addExit(Direction.WEST, r3);
        r5.addExit(Direction.NORTH, r5).addExit(Direction.SOUTH, r5).addExit(Direction.EAST, r5).addExit(Direction.WEST, r6);
        r6.addExit(Direction.NORTH, r6).addExit(Direction.SOUTH, r6).addExit(Direction.EAST, r3).addExit(Direction.WEST, r7);
        r7.addExit(Direction.SOUTH, r8).addExit(Direction.EAST, r6);
        r8.addExit(Direction.NORTH, r7);
        r9.addExit(Direction.UP, r8);
        r10.addExit(Direction.SOUTH, r17).addExit(Direction.EAST, r11).addExit(Direction.UP, r9);
        r11.addExit(Direction.NORTH, r13).addExit(Direction.EAST, r12).addExit(Direction.WEST, r10);
        r12.addExit(Direction.WEST, r11);
        r13.addExit(Direction.SOUTH, r11);
        r14.addExit(Direction.SOUTH, r15).addExit(Direction.WEST, r12);
        r15.addExit(Direction.NORTH, r14).addExit(Direction.EAST, r16);
        r16.addExit(Direction.WEST, r15);
        r17.addExit(Direction.NORTH, r10).addExit(Direction.WEST, r18);
        r18.addExit(Direction.EAST, r17).addExit(Direction.DOWN, r19);
        r19.addExit(Direction.UP, r18).addExit(Direction.DOWN, r20);
        r20.addExit(Direction.UP, r19);
        r21.addExit(Direction.WEST, r19).addExit(Direction.EAST, r22);
        r22.addExit(Direction.WEST, r21).addExit(Direction.SOUTH, r23);
        r23.addExit(Direction.NORTH, r22);
        r24.addExit(Direction.EAST, r25).addExit(Direction.WEST, r23);
        r25.addExit(Direction.WEST, r24);
        r26.addExit(Direction.SOUTH, r27).addExit(Direction.UP, r24);
        r27.addExit(Direction.NORTH, r26).addExit(Direction.WEST, r28);
        r28.addExit(Direction.EAST, r27);
        r29.addExit(Direction.EAST, r18);
        r30.addExit(Direction.NORTH, r31).addExit(Direction.DOWN, r29);
        r31.addExit(Direction.SOUTH, r30);
        r32.addExit(Direction.EAST, r30);

        ////////////////////////////////////////
        // Here, we create all the items in the game that the player can interact with
        ////////////////////////////////////////
        var keys = new Item("Ring of Keys");
        var shovel = new Item("Shovel");
        var water = new Item("Water");
        water.setNotLuggable("The water slips between your fingers. Do you have a container you could put it in instead?");
        var trident = new Item("*Jeweled Trident*");
        var bird = new Item("Raven");
        bird.setNotLuggable("The bird flutters just out of your reach.");
        var birdcage = new Item("Empty birdcage");
        var lamp = new LightSource("Shiny brass lamp");
        var bottle = new Item("Empty bottle");
        var food = new Item("Tasty food");
        var rug = new Item("Heavy rug");
        rug.setNotLuggable("The rug is too big to carry, but maybe you could move it.");
        var wand = new Item("Black wand");
        var bookcase = new Item("Bookcase");
        bookcase.setNotLuggable("The bookcase is too heavy to move by yourself.");
        var book = new Item("Book");
        var nugget = new Item("*Gold Nugget*");
        var pyramid = new Item("*Platinum Pyramid*");
        var snake = new Item("Giant Snake");
        snake.setNotLuggable("No way am I touching that!");
        var stone = new Item("Huge stone");
        stone.setNotLuggable("It's too heavy to move by yourself.");
        var pearls = new Item("*String of Pearls*");
        var sphere = new Item("Floating Blue Sphere");
        sphere.setNotLuggable("\"It's so beautiful,\" you whisper, and gingerly reach out to touch the glowing sphere. ZZAP!! A painful electric shock shakes your body. You're in no hurry to try THAT again.");
        var coins = new Item("*Ancient Coins*");
        var bear = new Item("Hungry Bear");
        bear.setNotLuggable("No way am I touching that!");
        var elephant = new Item("*Ivory Elephant*");
        elephant.setNotLuggable("The bear won't let me near it!");
        var mud = new Item("Mud");
        mud.setNotLuggable("I don't want to get my hands dirty. Is there something else you could do with the mud instead?");
        var box = new Item("Small wooden box");
        var jadestone = new Item("*Jadestone*");
        var gems = new Item("*Pot of Gems*");
        var plant = new Item("Withered Plant");
        plant.setNotLuggable("Best to leave it where it is.");
        var furniture = new Item("Giant-sized furniture");
        furniture.setNotLuggable("They're too heavy. And besides, the giant might notice if they were missing!");
        var harp = new Item("*Golden Harp*");
        var firestone = new Item("*Firestone*");
        var plaque = new Item("*Golden Plaque*");
        var scroll = new Item("Old Scroll");
        var diamond = new Item("*74 Carat Diamond*");

        ////////////////////////////////////////////////
        // Here, we assign possible actions to each item
        ////////////////////////////////////////////////
        lamp.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                if (lamp.isOn()) {
                    return "Turn the lamp off.";
                } else {
                    return "Turn the lamp on.";
                }
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (lamp.isOn()) {
                    lamp.turnOff();
                    MainActivity.success(p.getContext(), "You extinguish the lamp.");
                } else {
                    lamp.turnOn();
                    MainActivity.success(p.getContext(), "The lamp is now shining brightly.");
                }
                p.callForceRedisplay();
            }
        });

        bottle.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                if (bottleFull) {
                    if (p.getCurrentLocation() == r29) {
                        return "Water the plant.";
                    } else {
                        return "Pour out bottle.";
                    }
                } else {
                    return "Fill up bottle.";
                }
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (!bottleFull) {
                    if (p.getCurrentLocation() == r4) {
                        bottleFull = true;
                        bottle.changeDescription("Bottle of water");
                        MainActivity.success(p.getContext(), "You fill the bottle with water from the stream.");
                        p.callForceRedisplay();
                    } else {
                        MainActivity.failure(p.getContext(), "I don't have any liquid here to fill the bottle with.");
                    }
                } else {
                    bottleFull = false;
                    bottle.changeDescription("Empty bottle");
                    if (p.getCurrentLocation() == r29) {
                        if (!plantBeenWatered) {
                            plantBeenWatered = true;
                            r29.addExit(Direction.UP, r30);
                            r29.setAdditionalDescription("A tall leafy plant reaches all the way up to a hole in the ceiling. The plant appears climbable.");
                            plant.changeDescription("Very tall plant");
                            plant.setNotLuggable("It's too big to take, but you could climb it.");
                            MainActivity.success(p.getContext(), "As you pour water onto the parched plant, it spurts into furious growth for a few seconds. In just a moment, it reaches up to a previously-inaccessible hole in the ceiling.");
                        } else {
                            MainActivity.failure(p.getContext(), "You water the plant again, but it doesn't make any difference.");
                        }
                    } else {
                        MainActivity.failure(p.getContext(), "You pour the water onto the ground.");
                    }
                    p.callForceRedisplay();
                }
            }
        });

        keys.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                if (p.getCurrentLocation() == r8 && rugMoved) {
                    return "Try to unlock the trap door";
                } else if (p.isCarrying(box)) {
                    return "Try to unlock the wooden box";
                } else {
                    return "Try to unlock something.";
                }
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (p.getCurrentLocation() == r8 && rugMoved) {
                    if (!trapdoorOpen) {
                        trapdoorOpen = true;
                        r8.setAdditionalDescription("There is an open trapdoor in the floor, near a rumpled-up rug. The trapdoor reveals a rickety staircase leading down.");
                        r8.addExit(Direction.DOWN, r9);
                        MainActivity.success(p.getContext(), "Using one of your keys, the trapdoor unlocks and swings open. You see a rickety staircase leading down into the basement.");
                        p.callForceRedisplay();
                    } else {
                        MainActivity.failure(p.getContext(), "No need - it's already unlocked.");
                    }
                } else if (p.isCarrying(box)) {
                    if (!boxOpen) {
                        boxOpen = true;
                        p.getCurrentLocation().addItem(diamond);
                        MainActivity.success(p.getContext(), "Using your keys, you unlock the wooden box. As you do so, something falls out of it.");
                        p.callForceRedisplay();
                    } else {
                        MainActivity.failure(p.getContext(), "No need - it's already open.");
                    }
                } else {
                    MainActivity.failure(p.getContext(), "The keys don't try work on anything here.");
                }
            }
        });

        birdcage.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                if (birdcageEmpty && p.getCurrentLocation().contains(bird)) {
                    return "Put the raven into the birdcage";
                } else if (!birdcageEmpty) {
                    return "Open the birdcage";
                } else {
                    return "Examine the birdcage";
                }
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (birdcageEmpty && p.getCurrentLocation().contains(bird)) {
                    birdcageEmpty = false;
                    birdcage.changeDescription("Birdcage, with raven inside");
                    p.getCurrentLocation().removeFromVisibleItems(bird);
                    MainActivity.success(p.getContext(), "You open the door to the birdcage, and to your amazement, the raven flies right in! Quickly, you shut the door so it doesn't escape.");
                    p.callForceRedisplay();
                } else if (!birdcageEmpty) {
                    birdcageEmpty = true;
                    birdcage.changeDescription("Empty birdcage");
                    if (p.getCurrentLocation() == r18 && r18.contains(snake)) {
                        r18.removeFromVisibleItems(snake);
                        MainActivity.success(p.getContext(), "With a flick of the wrist, you open the birdcage. The raven bolts out of its cage and, in an astounding flurry, assaults the viper with beak and talon. Writhing in anger, the snake turns around and recedes into the darkness, the bird following close behind.");
                        r18.addExit(Direction.WEST, r29);
                        r18.setAdditionalDescription("There is a low tunnel which you can access to the west.");
                    } else {
                        MainActivity.failure(p.getContext(), "You open the cage, and the raven flies far away out of sight. Hopefully you can find it again.");
                        if (p.getCurrentLocation() == r6) {
                            r7.addItem(bird);
                        } else {
                            r6.addItem(bird);
                        }
                    }
                    p.callForceRedisplay();
                } else {
                    if (birdcageEmpty) {
                        MainActivity.success(p.getContext(), "It looks like a nice cage to keep a bird in.");
                    } else {
                        MainActivity.success(p.getContext(), "The raven seems content in its cage.");
                    }
                }
            }
        });

        food.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                if (p.getCurrentLocation() == r23 && !bearAsleep) {
                    return "Give the food to the bear.";
                } else {
                    return "Eat the food.";
                }
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (p.getCurrentLocation() == r23 && !bearAsleep) {
                    bearAsleep = true;
                    p.consumeItem(food);
                    bear.changeDescription("A peacefully sleeping bear");
                    r23.setAdditionalDescription("There is a hole in the east wall that looks big enough to enter.");
                    r23.addExit(Direction.EAST, r24);
                    elephant.setLuggable();
                    MainActivity.success(p.getContext(), "Gently, you place the food on the ground in front of the bear. The bear sniffs the food suspiciously, then starts to eat with gusto. After a moment, the bear curls up and begins to snore contentedly.");
                    p.callForceRedisplay();
                } else if (!tastedTheFood) {
                    tastedTheFood = true;
                    MainActivity.success(p.getContext(), "You taste a little bit of the food. It is delicious, but you decide to save the rest for later.");
                    //p.consumeItem(food);
                    //MainActivity.success(p.getContext(), "That was SO tasty! Thanks.");
                } else {
                    MainActivity.failure(p.getContext(), "Trust me. You should save it for later.");
                }
            }
        });

        wand.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Wave the wand";
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (p.getCurrentLocation() == r12 && !bridgeExists) {
                    bridgeExists = true;
                    r12.addExit(Direction.EAST, r14);
                    r12.setAdditionalDescription("A crystal bridge leads east, over the chasm.");
                    MainActivity.success(p.getContext(), "As you swish the wand, a crystal bridge miraculously appears, spanning the west and east ends of the chasm.");
                    p.callForceRedisplay();
                } else {
                    MainActivity.failure(p.getContext(), "Nothing happens.");
                }
            }
        });

        book.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Read the book";
            }

            @Override
            public void thatThingYouDo(Player p) {
                MainActivity.success(p.getContext(), "Most of the book is indecipherable, however, you can make out one sentence: \"The magic word is AWAY.\"");
                if (!bookRead) {
                    bookRead = true;
                    p.addMagicWord(new ItemAction() {
                        @Override
                        public String getName(Player p) {
                            return "AWAY";
                        }

                        @Override
                        public void thatThingYouDo(Player p) {
                            if (p.getCurrentLocation() == r9 && !bookcaseGone) {
                                bookcaseGone = true;
                                r9.removeFromVisibleItems(bookcase);
                                r9.addExit(Direction.DOWN, r10);
                                r9.setAdditionalDescription("There is a secret passage here, leading downward.");
                                MainActivity.success(p.getContext(), "As you murmur the word, the bookcase vanishes -- revealing a secret passage leading downward!");
                                p.callForceRedisplay();
                            } else if (p.getCurrentLocation() == r19) {
                                MainActivity.failure(p.getContext(), "The huge stone quivers slightly, but does not budge.");
                            } else {
                                MainActivity.failure(p.getContext(), "Nothing happens.");
                            }
                        }
                    });
                }
            }
        });

        scroll.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Read the scroll";
            }

            @Override
            public void thatThingYouDo(Player p) {
                MainActivity.success(p.getContext(), "The old scroll lists three Magic Words: XYZZY - EGYPT - SESAME.");
                if (!scrollRead) {
                    scrollRead = true;
                    p.addMagicWord(new ItemAction() {
                        @Override
                        public String getName(Player p) {
                            return "XYZZY";
                        }

                        @Override
                        public void thatThingYouDo(Player p) {
                            if (p.getCurrentLocation() == r10) {
                                MainActivity.success(p.getContext(), "As you speak the word, you start feeling dizzy. When you recover, you realize that you are somewhere else!");
                                p.go(r2);
                            } else if (p.getCurrentLocation() == r2) {
                                MainActivity.success(p.getContext(), "As you speak the word, you start feeling dizzy. When you recover, you realize that you are somewhere else!");
                                p.go(r10);
                            } else {
                                MainActivity.failure(p.getContext(), "Nothing happens.");
                            }
                        }
                    });
                    p.addMagicWord(new ItemAction() {
                        @Override
                        public String getName(Player p) {
                            return "EGYPT";
                        }

                        @Override
                        public void thatThingYouDo(Player p) {
                            if (!egyptSpoken) {
                                egyptSpoken = true;
                                r15.addItem(pyramid);
                                if (p.getCurrentLocation() == r15) {
                                    MainActivity.success(p.getContext(), "As you speak the word, you see a treasure materialize before your eyes: a small pyramid made of pure platinum!");
                                    p.callForceRedisplay();
                                } else {
                                    MainActivity.success(p.getContext(), "As you speak the word, you imagine yourself exploring an ancient pyramid. Perhaps it is a vision of the future?");
                                }
                            } else {
                                MainActivity.failure(p.getContext(), "Nothing happens.");
                            }
                        }
                    });
                    p.addMagicWord(new ItemAction() {
                        @Override
                        public String getName(Player p) {
                            return "SESAME";
                        }

                        @Override
                        public void thatThingYouDo(Player p) {
                            if (!sesameSpoken && p.getCurrentLocation() == r19) {
                                sesameSpoken = true;
                                r19.addExit(Direction.EAST, r21);
                                r19.setAdditionalDescription("Next to a large boulder, you can see a passage leading east.");
                                MainActivity.success(p.getContext(), "As you speak the word, the boulder begins to shake -- then slides forward, revealing a passage in the wall!");
                                p.callForceRedisplay();
                            } else {
                                MainActivity.failure(p.getContext(), "Nothing happens.");
                            }
                        }
                    });
                }
            }
        });

        shovel.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Dig here";
            }

            @Override
            public void thatThingYouDo(Player p) {
                final Room here = p.getCurrentLocation();
                if (here == r2 || here == r8 || here == r9) {
                    MainActivity.failure(p.getContext(), "Inside the building? I think not.");
                } else if (here == r24) {
                    if (!digOnce && !digTwice) {
                        digOnce = true;
                        r24.setAdditionalDescription("There is a shallow hole in the mud.");
                        r24.addItem(box);
                        MainActivity.success(p.getContext(), "You dig for a couple of minutes, and find a wooden box that was buried in the mud.");
                        p.callForceRedisplay();
                    } else if (digOnce && !digTwice) {
                        digTwice = true;
                        r24.setAdditionalDescription("There is a hole in the mud that looks big enough to climb into.");
                        r24.addExit(Direction.DOWN, r26);
                        MainActivity.success(p.getContext(), "You dig even more, and eventually create a deep hole that looks big enough to climb into.");
                        p.callForceRedisplay();
                    } else {
                        MainActivity.failure(p.getContext(), "You didn't find anything.");
                    }
                } else {
                    MainActivity.failure(p.getContext(), "You didn't find anything.");
                }
            }
        });

        box.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Try to open the box";
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (boxOpen) {
                    MainActivity.failure(p.getContext(), "No need, the box is already open.");
                } else {
                    if (p.has(keys)) {
                        boxOpen = true;
                        p.getCurrentLocation().addItem(diamond);
                        MainActivity.success(p.getContext(), "Using your keys, you unlock the wooden box. As you do so, something falls out of it.");
                        p.callForceRedisplay();
                    } else {
                        MainActivity.failure(p.getContext(), "Try as you might, the box is solidly locked shut. If only you had some keys!");
                    }
                }
            }
        });

        harp.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Play the harp";
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (p.getCurrentLocation() == r30 && !mistyPassageOpen) {
                    mistyPassageOpen = true;
                    r30.addExit(Direction.WEST, r32);
                    MainActivity.success(p.getContext(), "As you run your fingers over the harpstrings, a misty passage opens up in the west wall!");
                    p.callForceRedisplay();
                } else {
                    MainActivity.failure(p.getContext(), "You pluck out a pleasant tune on the harp. Your music teacher would be proud!");
                }
            }
        });

        plaque.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Read the plaque";
            }

            @Override
            public void thatThingYouDo(Player p) {
                MainActivity.success(p.getContext(), "Etched in gold is a message! It reads: \"Dig at Y7, then do it again.\"");
            }
        });

        /////////////////////////////////////////////////////
        // Here, we add the items to their starting locations
        /////////////////////////////////////////////////////
        r2.addItem(keys).addItem(shovel);
        r4.addItem(water).addItem(trident).addItem(birdcage);
        r6.addItem(bird);
        r7.addItem(lamp);
        r8.addItem(bottle).addItem(food).addItem(rug);
        r9.addItem(wand).addItem(bookcase).addItem(book);
        r13.addItem(nugget);
        r16.addItem(scroll);
        r18.addItem(snake);
        r19.addItem(stone);
        r20.addItem(pearls);
        r21.addItem(sphere);
        r22.addItem(coins);
        r23.addItem(bear);
        r23.addItem(elephant);
        r25.addItem(jadestone);
        r28.addItem(gems);
        r29.addItem(plant);
        r30.addItem(furniture).addItem(harp);
        r31.addItem(firestone);
        r32.addItem(plaque);

        ///////////////////////////////////////////////////////////////////
        // Here, we add special actions that are specific to certain rooms
        ///////////////////////////////////////////////////////////////////
        r8.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Move the rug";
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (rugMoved) {
                    MainActivity.failure(p.getContext(), "You push the rug around a bit, but don't find anything new.");
                } else {
                    rugMoved = true;
                    r8.setAdditionalDescription("There is a closed trapdoor in the floor, near a rumpled-up rug.");
                    MainActivity.success(p.getContext(), "When you move the rug, you discover a trapdoor underneath it!");
                    r8.addAction(new ItemAction() {
                        @Override
                        public String getName(Player p) {
                            return "Try to open the trapdoor";
                        }

                        @Override
                        public void thatThingYouDo(Player p) {
                            if (trapdoorOpen) {
                                MainActivity.failure(p.getContext(), "No need, the trapdoor is already open.");
                            } else {
                                if (p.has(keys)) {
                                    trapdoorOpen = true;
                                    r8.setAdditionalDescription("There is an open trapdoor in the floor, near a rumpled-up rug. The trapdoor reveals a rickety staircase leading down.");
                                    r8.addExit(Direction.DOWN, r9);
                                    MainActivity.success(p.getContext(), "Using one of your keys, the trapdoor unlocks and swings open. You see a rickety staircase leading down into the basement.");
                                    p.callForceRedisplay();
                                } else {
                                    MainActivity.failure(p.getContext(), "You tug at the trapdoor, but it is locked! If only you had a key...");
                                }
                            }
                        }
                    });
                    p.callForceRedisplay();
                }
            }
        });

        r31.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Jump into the volcano";
            }

            @Override
            public void thatThingYouDo(Player p) {
                MainActivity.failure(p.getContext(), "Are you crazy? No thanks.");
            }
        });

        r12.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Read the signpost";
            }

            @Override
            public void thatThingYouDo(Player p) {
                MainActivity.success(p.getContext(), "The sign reads: DANGER: 250 METER DROP");
            }
        });

        r24.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Read the signpost";
            }

            @Override
            public void thatThingYouDo(Player p) {
                MainActivity.success(p.getContext(), "The sign reads: \"Welcome to Y7.\"");
            }
        });

//        r21.addAction(new ItemAction() {
//            @Override
//            public String getName(Player p) {
//                return "Touch the glowing sphere";
//            }
//
//            @Override
//            public void thatThingYouDo(Player p) {
//                MainActivity.failure(p.getContext(), "\"It's so beautiful,\" you whisper, and gingerly reach out to touch the glowing sphere. ZZAP!! A painful electric shock shakes your body. You're in no hurry to try THAT again.");
//            }
//        });

        intro1.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Sneak out of the room and look for Grandpa";
            }

            @Override
            public void thatThingYouDo(Player p) {
                p.go(intro2);
                p.callForceRedisplay();
            }
        });

        intro1.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Stay in the party and see what happens";
            }

            @Override
            public void thatThingYouDo(Player p) {
                intro4.prependDescription(endOfParty);
                p.go(intro4);
                p.callForceRedisplay();
            }
        });

        intro2.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Mint Chocolate Chip";
            }

            @Override
            public void thatThingYouDo(Player p) {
                intro3.prependDescription(mintChocolateChip);
                p.go(intro3);
                p.callForceRedisplay();
            }
        });

        intro2.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Mackinac Island Fudge";
            }

            @Override
            public void thatThingYouDo(Player p) {
                intro3.prependDescription(mackinacIslandFudge);
                p.go(intro3);
                p.callForceRedisplay();
            }
        });

        intro3.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Make the trade";
            }

            @Override
            public void thatThingYouDo(Player p) {
                intro4.prependDescription(youTakeTheBook);
                p.go(intro4);
                p.callForceRedisplay();
            }
        });

        intro3.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "No deal";
            }

            @Override
            public void thatThingYouDo(Player p) {
                intro4.prependDescription(endOfParty);
                intro4.prependDescription(youRefuseTheBook);
                p.go(intro4);
                p.callForceRedisplay();
            }
        });

        intro4.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Begin";
            }

            @Override
            public void thatThingYouDo(Player p) {
                p.go(r1);
                p.callForceRedisplay();
            }
        });

        epilogue1.addAction(new ItemAction() {

            @Override
            public String getName(Player p) {
                return "The End";
            }

            @Override
            public void thatThingYouDo(Player p) {
                ((MainActivity)(p.getContext())).finish();
            }
        });

        ////////////////////////////////////////////////
        // Here, we mark the "special locations" as such
        ////////////////////////////////////////////////
        startingLocation = intro1;
        treasureRoom = r2;


        //TESTING
//        lamp.turnOn();
//        testing.testing_setStartRoom(r9);
//        testing.addToInventory(lamp);
    }

    public Room getStartingLocation() {
        return startingLocation;
    }

    public int reportScore() {
        return treasureRoom.combienDeTrésors();
    }

    public int totalPossibleTreasures() {
        return 12;
    }

    public String getAboutText() {
        return """
                Based on the public domain text adventure game for Commodore computers: "O'Hare's Adventure #1: The Cavern of Riches" by John O'Hare.
                
                Adapted for Android devices by Geoff Draper.
                
                The laptop on which this game was developed was powered in part by electricity derived from photovoltaic solar panels.
                """;
    }

    public Room getEpilogue() {
        return epilogue1;
    }

//    public String getFullName() {
//        return "O'Hare's Adventure I: The Cavern of Riches";
//    }
}
