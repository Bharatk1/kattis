import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.dto.TwoZeroFourEight;

public class TwoZeroFourEightProgram {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		List<String> arr = new ArrayList<>();

		for (int i = 0; i < 4; i++) {
			arr.add(sc.nextLine());
		}
		int move = sc.nextInt();

		if (move == 0 || move == 2) {
			Map<Integer, List<Integer>> rowList = new HashMap<>();
			for (int j = 0; j < arr.size(); j++) {
				List<Integer> row = new LinkedList<>();
				String[] split = arr.get(j).split(" ");
				row.add(Integer.parseInt(split[0]));
				row.add(Integer.parseInt(split[1]));
				row.add(Integer.parseInt(split[2]));
				row.add(Integer.parseInt(split[3]));
				rowList.put(j, row);
			}
			TwoZeroFourEight twoZeroFourEight = new TwoZeroFourEight(rowList.get(0), rowList.get(1), rowList.get(2),
					rowList.get(3));
			TwoZeroFourEight move2 = move(move, twoZeroFourEight);
			System.out.println(move2.getFirstRow());
			System.out.println(move2.getSecondRow());
			System.out.println(move2.getThirdRow());
			System.out.println(move2.getFourthRow());
		}

		if (move == 1 || move == 3) {
			List<Integer> firstColumn = new LinkedList<>();
			List<Integer> secondColumn = new LinkedList<>();
			List<Integer> thirdColumn = new LinkedList<>();
			List<Integer> fourthColumn = new LinkedList<>();
			for (int j = 0; j < arr.size(); j++) {
				String[] split = arr.get(j).split(" ");
				firstColumn.add(Integer.parseInt(split[0]));
				secondColumn.add(Integer.parseInt(split[1]));
				thirdColumn.add(Integer.parseInt(split[2]));
				fourthColumn.add(Integer.parseInt(split[3]));
			}
			TwoZeroFourEight twoZeroFourEight = new TwoZeroFourEight(firstColumn, secondColumn, thirdColumn,
					fourthColumn);
			TwoZeroFourEight move2 = move(move, twoZeroFourEight);
			System.out.println(move2.getFirstRow());
			System.out.println(move2.getSecondRow());
			System.out.println(move2.getThirdRow());
			System.out.println(move2.getFourthRow());
		}

	}

	private static TwoZeroFourEight move(int move, TwoZeroFourEight twoZeroFourEight) {
		switch (move) {
		case 0:
			return left(twoZeroFourEight);
		case 1:
			return up(twoZeroFourEight);
		case 2:
			return right(twoZeroFourEight);
		case 3:
			
			
			return down(twoZeroFourEight);
		default:
			return twoZeroFourEight;
		}
	}

	private static TwoZeroFourEight left(TwoZeroFourEight twoZeroFourEight) {
		List<Integer> firstRow = twoZeroFourEight.getFirstRow();
		List<Integer> secondRow = twoZeroFourEight.getSecondRow();
		List<Integer> thirdRow = twoZeroFourEight.getThirdRow();
		List<Integer> fourthRow = twoZeroFourEight.getFourthRow();
		List<Integer> updatedFirstRow = setRowValuesLeftMove(firstRow);
		List<Integer> updatedSecondRow = setRowValuesLeftMove(secondRow);
		List<Integer> updatedThirdRow = setRowValuesLeftMove(thirdRow);
		List<Integer> updatedFourthRow = setRowValuesLeftMove(fourthRow);
		return new TwoZeroFourEight(updatedFirstRow, updatedSecondRow, updatedThirdRow, updatedFourthRow);
	}

	private static List<Integer> setRowValuesRightMove(List<Integer> row) {
		List<Integer> updatedRow = new LinkedList<>();
		if (row.get(2) == row.get(3)) {
			if (row.get(0) == row.get(1)) {
				updatedRow.add(0);
				updatedRow.add(0);
				updatedRow.add(row.get(0) + row.get(1));

			} else {
				updatedRow.add(0);
				updatedRow.add(row.get(0));
				updatedRow.add(row.get(1));
			}
			updatedRow.add(row.get(2) + row.get(3));

		} else if (row.get(0) == row.get(2) && row.get(1) == 0) {
			updatedRow.add(0);
			updatedRow.add(0);
			updatedRow.add(row.get(0) + row.get(2));
			updatedRow.add(row.get(3));

		} else if (row.get(0) == row.get(3) && row.get(1) == 0 && row.get(2) == 0) {
			updatedRow.add(0);
			updatedRow.add(0);
			updatedRow.add(0);
			updatedRow.add(row.get(0) + row.get(3));

		} else if (row.get(1) == row.get(3) && row.get(0) == 0 && row.get(2) == 0) {
			updatedRow.add(0);
			updatedRow.add(0);
			updatedRow.add(0);
			updatedRow.add(row.get(1) + row.get(3));
		} else if (row.get(1) == row.get(2) && row.get(0) == 0 && row.get(3) == 0) {
			updatedRow.add(0);
			updatedRow.add(0);
			updatedRow.add(0);
			updatedRow.add(row.get(1) + row.get(2));

		} else {
			return row;
		}
		return updatedRow;
	}

	private static List<Integer> setRowValuesLeftMove(List<Integer> row) {
		List<Integer> updatedRow = new LinkedList<>();
		if (row.get(0) == row.get(1)) {
			updatedRow.add(row.get(0) + row.get(1));
			if (row.get(2) == row.get(3)) {
				updatedRow.add(row.get(2) + row.get(3));
				updatedRow.add(0);
				updatedRow.add(0);
			} else {
				updatedRow.add(row.get(2));
				updatedRow.add(row.get(3));
				updatedRow.add(0);
			}

		} else if (row.get(0) == row.get(2) && row.get(1) == 0) {
			updatedRow.add(row.get(0) + row.get(2));
			updatedRow.add(row.get(3));
			updatedRow.add(0);
			updatedRow.add(0);
		} else if (row.get(0) == row.get(3) && row.get(1) == 0 && row.get(2) == 0) {
			updatedRow.add(row.get(0) + row.get(3));
			updatedRow.add(0);
			updatedRow.add(0);
			updatedRow.add(0);
		} else if (row.get(1) == row.get(3) && row.get(0) == 0 && row.get(2) == 0) {
			updatedRow.add(row.get(1) + row.get(3));
			updatedRow.add(0);
			updatedRow.add(0);
			updatedRow.add(0);
		}

		else if (row.get(1) == row.get(2) && row.get(0) == 0 && row.get(3) == 0) {
			updatedRow.add(row.get(1) + row.get(2));
			updatedRow.add(0);
			updatedRow.add(0);
			updatedRow.add(0);

		} else {
			return row;
		}
		return updatedRow;
	}

	private static TwoZeroFourEight up(TwoZeroFourEight twoZeroFourEight) {
		return null;
	}

	private static TwoZeroFourEight right(TwoZeroFourEight twoZeroFourEight) {
		List<Integer> firstRow = twoZeroFourEight.getFirstRow();
		List<Integer> secondRow = twoZeroFourEight.getSecondRow();
		List<Integer> thirdRow = twoZeroFourEight.getThirdRow();
		List<Integer> fourthRow = twoZeroFourEight.getFourthRow();
		List<Integer> updatedFirstRow = setRowValuesRightMove(firstRow);
		List<Integer> updatedSecondRow = setRowValuesRightMove(secondRow);
		List<Integer> updatedThirdRow = setRowValuesRightMove(thirdRow);
		List<Integer> updatedFourthRow = setRowValuesRightMove(fourthRow);
		return new TwoZeroFourEight(updatedFirstRow, updatedSecondRow, updatedThirdRow, updatedFourthRow);
	}

	private static TwoZeroFourEight down(TwoZeroFourEight twoZeroFourEight) {
		return null;
	}
}
