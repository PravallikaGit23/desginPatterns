package TicTacToe.models;

import TicTacToe.exception.BotExceededException;
import TicTacToe.exception.DuplicateSymbolFoundException;
import TicTacToe.exception.NumberOfPlayersException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidateGame {
    List<Player> players;
    int size;
    public ValidateGame(List<Player> players, int sizeOfBoard) {
        this.players = players;
        this.size = sizeOfBoard;
    }

    public void validateBoardSize() throws NumberOfPlayersException {
        if(players.size() != size-1){
            throw new NumberOfPlayersException("number of players should be size+1");
        }
    }
    public void validateSymbolUniqueness() throws DuplicateSymbolFoundException {
        Set<Character> symbols = new HashSet<Character>();
        for (Player player : players) {
            char playerSymbol =  player.getSymbol().getaChar();
            if(symbols.contains(playerSymbol)) {
                throw new DuplicateSymbolFoundException("Same Symbols are not allowed.");
            }
            symbols.add(playerSymbol);

        }
    }

    public void validateBotCount() throws BotExceededException {
        int botCount = 0;
        for (Player player : players) {
            if(player.getType() == PlayerType.BOT){
                botCount++;
            }
        }
        if(botCount > 1){
            throw new BotExceededException("only one bot allowed.");
        }
    }
}
