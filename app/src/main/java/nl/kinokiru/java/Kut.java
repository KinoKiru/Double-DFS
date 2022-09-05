package nl.kinokiru.java;

import java.util.HashSet;
import java.util.ArrayList;
import nl.kinokiru.java.models.*;

import static nl.kinokiru.java.models.Color.*;

/**
 * Kut
 */
public class Kut {

    public static void main(String[] args) {
        Board board = new Board();
        final ArrayList<Place> path = dfs(new HashSet<>(), board.board.get(0), board.board.get(1));
        System.out.println(path);

        // N*N
        int N = 1000;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

            }
        }
    }

    private static ArrayList<Place> dfs(HashSet<Place> visited, Place pos1, Place pos2) {
        ArrayList<Place> path = new ArrayList<>();

        visited.add(pos2);

        System.out.printf("%d : %d%n", pos1.getNumber(), pos2.getNumber());

        if (isGoal(pos1)) {
            path.add(0, pos1);
            path.add(0, pos2);
            return path;
        }

        for (Place neighbor1 : pos1.getPlaces(pos2)) {
            if (!visited.contains(neighbor1)) {
                // System.out.printf("%d => %d%n", pos1.getNumber(), neighbor1.getNumber());
                path = dfs(visited, neighbor1, pos2);
                if (path.isEmpty()) {
                    path = dfs(visited, pos2, neighbor1);
                }
                // System.out.printf("%d <= %d%n", pos1.getNumber(), neighbor1.getNumber());
                if (!path.isEmpty()) {
                    path.add(0, neighbor1);
                    path.add(0, pos2);
                    return path;
                }

                for (Place neighbor2 : pos2.getPlaces(neighbor1)) {
                    if (!visited.contains(neighbor2)) {
                        // System.out.printf("%d => %d%n", pos2.getNumber(), neighbor2.getNumber());
                        path = dfs(visited, neighbor1, neighbor2);
                        if (path.isEmpty()) {
                            path = dfs(visited, neighbor2, neighbor1);
                        }

                        // System.out.printf("%d <= %d%n", pos2.getNumber(), neighbor2.getNumber());
                        if (!path.isEmpty()) {
                            path.add(0, neighbor1);
                            path.add(0, neighbor2);
                            return path;
                        }
                    }
                }
            }
        }

        visited.remove(pos1);
        visited.remove(pos2);

        return path;
    }

    private static boolean isGoal(Place place) {
        return place.getColor() == BLUE;
    }
}

/*
 * for (Place neighbor2 : pos2.getPlaces(neighbor1)) {
 * if (!visited.contains(neighbor2)) {
 * visited.add(neighbor2);
 * // visited.add(neighbor2);
 * path = dfs(visited, neighbor1, neighbor2);
 * if (!path.isEmpty()) {
 * return path;
 * }
 * }
 * }
 */