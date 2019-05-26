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
			for (int i = 0; i < 4; i++) {
				System.out.println(move2.getFirstRow().get(i) + " " + move2.getSecondRow().get(i) + " "
						+ move2.getThirdRow().get(i) + " " + move2.getFourthRow().get(i));
			}
			
		}

	}

	private static TwoZeroFourEight move(int move, TwoZeroFourEight twoZeroFourEight) {
		switch (move) {
		case 0:
			return leftOrUp(twoZeroFourEight);
		case 1:
			return leftOrUp(twoZeroFourEight);
		case 2:
			return rightOrDown(twoZeroFourEight);
		case 3:
			return rightOrDown(twoZeroFourEight);
		default:
			return twoZeroFourEight;
		}
	}

	private static TwoZeroFourEight leftOrUp(TwoZeroFourEight twoZeroFourEight) {
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
		updatedRow.add(row.get(3));
		updatedRow.add(row.get(2));
		updatedRow.add(row.get(1));
		updatedRow.add(row.get(0));

		List<Integer> setRowValuesLeftMove = setRowValuesLeftMove(updatedRow);
		List<Integer> updatedRowRight = new LinkedList<>();
		updatedRowRight.add(setRowValuesLeftMove.get(3));
		updatedRowRight.add(setRowValuesLeftMove.get(2));
		updatedRowRight.add(setRowValuesLeftMove.get(1));
		updatedRowRight.add(setRowValuesLeftMove.get(0));
		return updatedRowRight;
	}

	private static List<Integer> setRowValuesLeftMove(List<Integer> row) {
		List<Integer> updatedRow = new LinkedList<>();
		Integer element1 = row.get(0);
		Integer element2 = row.get(1);
		Integer element3 = row.get(2);
		Integer element4 = row.get(3);

		int updateFirstElement = element1;
		int updateSecondElement = element2;
		int updateThirdElement = element3;
		int updateFourthElement = element4;
		if (element2 == element1 || element2 == 0 || element1 == 0) {
			updateFirstElement = element2 + element1;
			updateSecondElement = element3;
			updateThirdElement = element4;
			updateFourthElement = 0;
			if (updateFirstElement == updateSecondElement || (updateFirstElement == 0) || updateSecondElement == 0) {
				updateFirstElement = updateFirstElement + updateSecondElement;
				updateSecondElement = updateThirdElement;
				updateThirdElement = 0;

			}
			if ((updateFirstElement == updateSecondElement) || updateFirstElement == 0) {
				updateFirstElement = updateFirstElement + updateSecondElement;
				updateSecondElement = 0;

			}

			updatedRow.add(updateFirstElement);
			updatedRow.add(updateSecondElement);
			updatedRow.add(updateThirdElement);
			updatedRow.add(updateFourthElement);
			return updatedRow;
		}

		if (element3 == element4 || element4 == 0 || element3 == 0) {
			updateThirdElement = element4 + element3;
			updateFourthElement = 0;

			if (updateThirdElement == element2) {
				updateSecondElement = element2 + updateThirdElement;
				updateThirdElement = 0;
			}
			if ((element1 == updateSecondElement)) {
				updateFirstElement = updateSecondElement + element1;
				updateSecondElement = 0;
			}

			updatedRow.add(updateFirstElement);
			updatedRow.add(updateSecondElement);
			updatedRow.add(updateThirdElement);
			updatedRow.add(updateFourthElement);
			return updatedRow;
		}
		if (element3 == element2) {
			updateSecondElement = element2 + element3;
			updateThirdElement = element4;
			updateFourthElement = 0;

			if (updateSecondElement == updateThirdElement) {
				updateSecondElement = updateSecondElement + updateThirdElement;
				updateThirdElement = 0;
			}
			if (element1 == updateSecondElement) {
				updateFirstElement = updateSecondElement + element1;
				updateSecondElement = updateThirdElement;
				updateThirdElement = 0;
			}

			updatedRow.add(updateFirstElement);
			updatedRow.add(updateSecondElement);
			updatedRow.add(updateThirdElement);
			updatedRow.add(updateFourthElement);
			return updatedRow;
		}
		return row;
	}

	private static TwoZeroFourEight rightOrDown(TwoZeroFourEight twoZeroFourEight) {
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

}
