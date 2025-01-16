package TicTacToe.models;

import TicTacToe.Strategy.WinningStrategy;
import TicTacToe.exception.BotExceededException;
import TicTacToe.exception.DuplicateSymbolFoundException;
import TicTacToe.exception.NumberOfPlayersException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    List<Player> players;
    Board board;
    List<Move> moves;
    GameState gameState;
    Player winner = null;
    List<WinningStrategy> winningStrategies;
    int turn;

    public Game(List<Player> players,List<WinningStrategy> winningStrategies,int size) {
     this.players = players;
     this.winningStrategies = winningStrategies;
     this.moves = new ArrayList<Move>();
     this.turn = 0;
     this.board = new Board(size);
     this.gameState = GameState.IN_PROGRESS;
    }

    public static class Builder{
        List<Player> players;
        int size;
        List<WinningStrategy> winningStrategies;

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        public Builder setSize(int size) {
            this.size = size;
            return this;

        }
        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
        public void build() throws BotExceededException, NumberOfPlayersException, DuplicateSymbolFoundException {
            validate();
            new Game(players,winningStrategies,size);
        }

        private void validate() throws BotExceededException, NumberOfPlayersException, DuplicateSymbolFoundException {
            ValidateGame validateGame = new ValidateGame(players,size);
            validateGame.validateBotCount();
            validateGame.validateBoardSize();
            validateGame.validateSymbolUniqueness();
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
}
