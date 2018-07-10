DROP TABLE IF EXISTS `cards`;
DROP TABLE IF EXISTS `accounts`;
CREATE TABLE `accounts` (
    `account_id` INT(8) ZEROFILL NOT NULL AUTO_INCREMENT,
    `last_name` VARCHAR(20) NOT NULL,
    `first_name` VARCHAR(20) NOT NULL,
    `balance` DECIMAL(7,2),
    `account_type` VARCHAR(8) NOT NULL,
    PRIMARY KEY (`account_id`)
);

DROP TABLE IF EXISTS `cards`;
CREATE TABLE `cards` (
    `card_number` INT(16) ZEROFILL NOT NULL AUTO_INCREMENT,
    `last_name` VARCHAR(20) NOT NULL,
    `first_name` VARCHAR(20) NOT NULL,
    `activated` BOOLEAN NOT NULL,
    `pin` INT(4) NOT NULL,
    `account_id` INT(8) ZEROFILL NOT NULL,
    PRIMARY KEY (`card_number`),
    FOREIGN KEY (`account_id`)
    REFERENCES `accounts` (`account_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);