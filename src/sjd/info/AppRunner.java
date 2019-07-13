package sjd.info;

import sjd.info.service.NumberService;

import java.util.logging.Logger;

public class AppRunner {

    private static Logger logger = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {
        logger.info(String.valueOf(NumberService.getSumByDivision(12345)));
        logger.info(String.valueOf(NumberService.getSumByTypeManipulation(12345)));
        logger.info(String.valueOf(NumberService.getMaxPalindrome(1000, 9999)));
    }
}
