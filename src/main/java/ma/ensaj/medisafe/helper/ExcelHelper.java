package ma.ensaj.medisafe.helper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ma.ensaj.medisafe.beans.Medicaments;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

public class ExcelHelper {
    public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    static String[] HEADERs = { "id", "code", "nom", "DCI1","DOSAGE1","UNITE_DOSAGE1","FORME","PRESENTATION","FORME","PRESENTATION","PPV","PH","PRIX_BR","PRINCEPS_GENERIQUE","TAUX_REMBOURSEMENT" };
    static String SHEET = "medicaments";

    public static boolean hasExcelFormat(MultipartFile file) {

        if (!TYPE.equals(file.getContentType())) {
            return false;
        }

        return true;
    }



    public static List<Medicaments> excelToTutorials(InputStream is) {
        try {
            Workbook workbook = new XSSFWorkbook(is);

            Sheet sheet = workbook.getSheet(SHEET);
            Iterator<Row> rows = sheet.iterator();

            List<Medicaments> medicaments = new ArrayList<Medicaments>();

            int rowNumber = 0;
            while (rows.hasNext()) {
                Row currentRow = rows.next();

                // skip header
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cellsInRow = currentRow.iterator();

                Medicaments medicament = new Medicaments();

                int cellIdx = 0;
                while (cellsInRow.hasNext()) {
                    Cell currentCell = cellsInRow.next();

                    switch (cellIdx) {
                        case 0:
                            medicament.setCode(currentCell.getStringCellValue());
                            break;

                        case 1:
                            medicament.setNom(currentCell.getStringCellValue());
                            break;

                        case 2:
                            medicament.setDCI1(currentCell.getStringCellValue());
                            break;

                        case 3:
                            medicament.setDOSAGE1(currentCell.getStringCellValue());
                            break;
                        case 4:
                            medicament.setUNITE_DOSAGE1(currentCell.getStringCellValue());
                            break;
                        case 5:
                            medicament.setFORME(currentCell.getStringCellValue());
                            break;
                        case 6:
                            medicament.setPRESENTATION(currentCell.getStringCellValue());
                            break;
                        case 7:
                            medicament.setPPV(currentCell.getNumericCellValue());
                            break;
                        case 8:
                            medicament.setPH(currentCell.getNumericCellValue());
                            break;
                        case 9:
                            medicament.setPRIX_BR(currentCell.getNumericCellValue());
                            break;
                        case 10:
                            medicament.setPRINCEPS_GENERIQUE(currentCell.getStringCellValue());
                            break;
                        case 11:
                            medicament.setTAUX_REMBOURSEMENT(currentCell.getStringCellValue());
                            break;

                        default:
                            break;
                    }

                    cellIdx++;
                }

                medicaments.add(medicament);
            }

            workbook.close();

            return medicaments;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
        }
    }
}