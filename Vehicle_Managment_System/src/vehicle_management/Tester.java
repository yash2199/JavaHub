package vehicle_management;

import java.time.LocalDate;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			LocalDate limit = LocalDate.parse("2021-01-01");

			System.out.println("enter the manufacture date");
			LocalDate ld = LocalDate.parse(sc.next());
			Vehicle V2, V1;
			if (ld.isAfter(limit)) {
				System.out.println(
						" 1:chasis_no \n,  2:company\n, 3:isAvailable\n, 4:color\n,  5:base_price\n, 6:manufactureDate\n");
				V1 = new Vehicle(sc.next(), sc.next(), sc.nextBoolean(), color.valueOf(sc.next().toUpperCase()),
						sc.nextDouble(), ld);
				System.out.println(V1);
			} else
				throw new DateInvalidException("date is not after the 01-01-2021");
			System.out.println("enter the manufacuture date ");
			LocalDate ld1 = LocalDate.parse(sc.next());
			System.out.println(
					" 1:chasis_no \n,  2:company\n, 3:isAvailable\n, 4:color\n,  5:base_price\n, 6:manufactureDate\n");
			V2 = new Vehicle(sc.next(), sc.next(), sc.nextBoolean(), color.valueOf(sc.next().toUpperCase()),
					sc.nextDouble(), ld);
			if (ld.isAfter(limit)) {
				if (V1.equals(V2)) {
					throw new DuplicateEntry("chasis number is already exists");
				}
			}

		} catch (DateInvalidException e) {
			System.out.println(e);
		} catch (DuplicateEntry d) {
			System.out.println(d);
		}
	}
}
