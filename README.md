# Blackjack

[![Java Build](https://github.com/JTirado06/BlackJack/actions/workflows/build.yml/badge.svg)](https://github.com/JTirado06/BlackJack/actions/workflows/build.yml)

A command-line Blackjack game written in Java. The player competes against a computer-controlled dealer using standard Blackjack rules.

## Features

* Creates and shuffles a standard 52-card deck
* Supports hitting and standing
* Automatically adjusts an Ace from 11 to 1 when necessary
* Dealer draws until reaching at least 17
* Detects wins, losses, ties, and busts
* Allows the player to play multiple rounds

## Technologies

* Java
* Object-oriented programming
* Java Collections Framework

## Project Structure

* `BlackjackGame.java` — controls gameplay and user input
* `Card.java` — represents an individual playing card
* `Deck.java` — creates, shuffles, and deals the deck
* `Player.java` — manages a hand and calculates its value

## How to Run

Make sure Java is installed, then clone and run the project:

```bash
git clone https://github.com/JTirado06/BlackJack.git
cd BlackJack
javac src/*.java
java -cp src BlackjackGame
```
## Example Gameplay

```text
Dealer's hand:
Hidden
8 of Hearts

Your hand:
10 of Clubs
7 of Diamonds
Your total: 17

Hit or Stand? stand

Dealer's turn:
Queen of Spades
8 of Hearts

Final Totals - You: 17, Dealer: 18
Dealer wins.

Play again? (yes/no): no
Thanks for playing!
```

## Future Improvements

* Add betting and chip tracking
* Add splitting and doubling down
* Add automated tests
* Create a graphical user interface
