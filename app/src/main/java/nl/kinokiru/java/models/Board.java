package nl.kinokiru.java.models;

import java.util.ArrayList;

public class Board {
        public ArrayList<Place> board = new ArrayList<>();

        public Board() {
                board.add(new Place(1, Color.PURPLE));
                board.add(new Place(2, Color.BLACK));
                board.add(new Place(3, Color.GREEN));
                board.add(new Place(4, Color.GREEN));
                board.add(new Place(5, Color.GREEN));
                board.add(new Place(6, Color.ORANGE));
                board.add(new Place(7, Color.ORANGE));
                board.add(new Place(8, Color.PURPLE));
                board.add(new Place(9, Color.PURPLE));
                board.add(new Place(10, Color.BLACK));
                board.add(new Place(11, Color.ORANGE));
                board.add(new Place(12, Color.PURPLE));
                board.add(new Place(13, Color.ORANGE));
                board.add(new Place(14, Color.GREEN));
                board.add(new Place(15, Color.ORANGE));
                board.add(new Place(16, Color.GREEN));
                board.add(new Place(17, Color.GREEN));
                board.add(new Place(18, Color.BLACK));
                board.add(new Place(19, Color.ORANGE));
                board.add(new Place(20, Color.GREEN));
                board.add(new Place(21, Color.BLACK));
                board.add(new Place(22, Color.BLACK));
                board.add(new Place(23, Color.BLUE));

                board.get(0).setArrows(new Arrow[] {
                                new Arrow(Color.PURPLE, board.get(3)),
                                new Arrow(Color.BLACK, board.get(4)),
                });
                board.get(1).setArrows(new Arrow[] {
                                new Arrow(Color.GREEN, board.get(5)),
                                new Arrow(Color.PURPLE, board.get(11)),
                });
                board.get(2).setArrows(new Arrow[] {
                                new Arrow(Color.ORANGE, board.get(0)),
                                new Arrow(Color.ORANGE, board.get(3)),
                });
                board.get(3).setArrows(new Arrow[] {
                                new Arrow(Color.BLACK, board.get(12)),
                });
                board.get(4).setArrows(new Arrow[] {
                                new Arrow(Color.ORANGE, board.get(8)),
                });
                board.get(5).setArrows(new Arrow[] {
                                new Arrow(Color.GREEN, board.get(8)),
                                new Arrow(Color.PURPLE, board.get(9)),
                });
                board.get(6).setArrows(new Arrow[] {
                                new Arrow(Color.GREEN, board.get(1)),
                });
                board.get(7).setArrows(new Arrow[] {
                                new Arrow(Color.PURPLE, board.get(2)),
                });
                board.get(8).setArrows(new Arrow[] {
                                new Arrow(Color.GREEN, board.get(3)),
                                new Arrow(Color.BLACK, board.get(13)),
                });
                board.get(9).setArrows(new Arrow[] {
                                new Arrow(Color.GREEN, board.get(14)),
                });
                board.get(10).setArrows(new Arrow[] {
                                new Arrow(Color.GREEN, board.get(11)),
                                new Arrow(Color.PURPLE, board.get(9)),
                });
                board.get(11).setArrows(new Arrow[] {
                                new Arrow(Color.GREEN, board.get(6)),
                });
                board.get(12).setArrows(new Arrow[] {
                                new Arrow(Color.GREEN, board.get(17)),
                                new Arrow(Color.GREEN, board.get(7)),
                });
                board.get(13).setArrows(new Arrow[] {
                                new Arrow(Color.ORANGE, board.get(19)),
                                new Arrow(Color.GREEN, board.get(22)),
                });
                board.get(14).setArrows(new Arrow[] {
                                new Arrow(Color.PURPLE, board.get(22)),
                                new Arrow(Color.GREEN, board.get(21)),
                });
                board.get(15).setArrows(new Arrow[] {
                                new Arrow(Color.GREEN, board.get(14)),
                });
                board.get(16).setArrows(new Arrow[] {
                                new Arrow(Color.BLACK, board.get(10)),
                                new Arrow(Color.BLACK, board.get(15)),
                                new Arrow(Color.PURPLE, board.get(11)),
                });
                board.get(17).setArrows(new Arrow[] {
                                new Arrow(Color.ORANGE, board.get(19)),
                                new Arrow(Color.ORANGE, board.get(8)),
                });
                board.get(18).setArrows(new Arrow[] {
                                new Arrow(Color.GREEN, board.get(17)),
                });
                board.get(19).setArrows(new Arrow[] {
                                new Arrow(Color.ORANGE, board.get(20)),
                                new Arrow(Color.BLACK, board.get(18)),
                });
                board.get(20).setArrows(new Arrow[] {
                                new Arrow(Color.ORANGE, board.get(21)),
                                new Arrow(Color.BLACK, board.get(22)),
                });
                board.get(21).setArrows(new Arrow[] {
                                new Arrow(Color.ORANGE, board.get(16)),
                });
        }
}
