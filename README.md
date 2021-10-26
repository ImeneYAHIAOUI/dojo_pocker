# dojo-poker-21-22-gd12

This project is about implementing a
poker game comparator.

We have two hands, each one has 5 cards taken from
a 52 cards packet.

individual cards are ranked from highest to lowest :
 A, K, Q, J, 10, 9, 8, 7, 6, 5, 4, 3 and 2.

In this project, the cards don't have colors, so the colour based hand rankings (Quinch Flush and colour )are not implemented.

Poker hand ranking:

1) Square: Four cards of the same rank, and one side card or ‘kicker’.
2) Full: Three cards of the same rank, and two cards of a different, matching rank.
3) Straight (Suite): Five cards in sequence.
4) Three of a kind (Brelan): Three cards of the same rank, and two unrelated side cards.
5) Two pair: Two cards of a matching rank, another two cards of a different matching rank, and one side card.
6) One pair: Two cards of a matching rank, and three unrelated side cards.
7) High card: Any hand that does not qualify under a category listed above.

In the event of a tie: Highest card wins.

How does it work:

Once the program is compiled and executed, the user will be asked to enter the first hand in the form of a  
string, separating ech card by a space.
If the user enter an invalid hand (incorrect number of cards or an invalid card), 
they will be asked to submit a new hand.

Same process is repeated for the second hand.

Once both hands are successfully submitted, the program will use the different comparison classes to get and display the result of
the game.

Example:

Main 1: 4 R 3 R R 

Main 2: A 3 A 3 3

Voici vos cartes : [4, R, 3, R, R] et [A, 3, A, 3, 3]

C'est la main 1 qui gagne avec brelan : R







