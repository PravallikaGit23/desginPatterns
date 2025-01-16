package TicTacToe.models;

public class Bot extends Player {
    private final DifficultyLevel difficultyLevel;
    public Bot(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }
}
