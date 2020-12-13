-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema CitasMedicasBD
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `CitasMedicasBD` ;

-- -----------------------------------------------------
-- Schema CitasMedicasBD
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `CitasMedicasBD` DEFAULT CHARACTER SET utf8 ;
USE `CitasMedicasBD` ;

-- -----------------------------------------------------
-- Table `CitasMedicasBD`.`PACIENTES`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `CitasMedicasBD`.`PACIENTES` ;

CREATE TABLE IF NOT EXISTS `CitasMedicasBD`.`PACIENTES` (
  `pacIdentificacion` INT NOT NULL,
  `pacNombre` VARCHAR(45) NULL,
  `pacApellidos` VARCHAR(45) NULL,
  `pacFechaNacimiento` DATE NULL,
  `pacGenero` VARCHAR(10) NULL,
  PRIMARY KEY (`pacIdentificacion`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CitasMedicasBD`.`TRATAMIENTOS`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `CitasMedicasBD`.`TRATAMIENTOS` ;

CREATE TABLE IF NOT EXISTS `CitasMedicasBD`.`TRATAMIENTOS` (
  `traNumero` INT NOT NULL,
  `traFechaAsignado` DATE NULL,
  `traDescripcion` VARCHAR(45) NULL,
  `traFechaInicio` DATE NULL,
  `traFechafin` DATE NULL,
  `traObservaciones` VARCHAR(45) NULL,
  `traPaciente` VARCHAR(45) NULL,
  `PACIENTES_pacIdentificacion` INT NOT NULL,
  PRIMARY KEY (`traNumero`, `PACIENTES_pacIdentificacion`),
  INDEX `fk_TRATAMIENTOS_PACIENTES1_idx` (`PACIENTES_pacIdentificacion` ASC) VISIBLE,
  CONSTRAINT `fk_TRATAMIENTOS_PACIENTES1`
    FOREIGN KEY (`PACIENTES_pacIdentificacion`)
    REFERENCES `CitasMedicasBD`.`PACIENTES` (`pacIdentificacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CitasMedicasBD`.`CONSULTORIOS`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `CitasMedicasBD`.`CONSULTORIOS` ;

CREATE TABLE IF NOT EXISTS `CitasMedicasBD`.`CONSULTORIOS` (
  `conNumero` INT NOT NULL,
  `conNombre` VARCHAR(45) NULL,
  PRIMARY KEY (`conNumero`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CitasMedicasBD`.`MEDICOS`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `CitasMedicasBD`.`MEDICOS` ;

CREATE TABLE IF NOT EXISTS `CitasMedicasBD`.`MEDICOS` (
  `medIdentificacion` INT NOT NULL,
  `medNombre` VARCHAR(45) NULL,
  `medApellidos` VARCHAR(45) NULL,
  PRIMARY KEY (`medIdentificacion`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CitasMedicasBD`.`CITAS`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `CitasMedicasBD`.`CITAS` ;

CREATE TABLE IF NOT EXISTS `CitasMedicasBD`.`CITAS` (
  `citNumero` INT NOT NULL,
  `citFecha` DATE NULL,
  `citHora` TIME NULL,
  `citPaciente` VARCHAR(45) NULL,
  `citMedico` VARCHAR(45) NULL,
  `citConsultorio` INT NULL,
  `citEstado` VARCHAR(45) NULL,
  `citObservaciones` VARCHAR(45) NULL,
  `CONSULTORIOS_conNumero` INT NOT NULL,
  `MEDICOS_medIdentificacion` INT NOT NULL,
  `PACIENTES_pacIdentificacion` INT NOT NULL,
  PRIMARY KEY (`citNumero`, `CONSULTORIOS_conNumero`, `MEDICOS_medIdentificacion`, `PACIENTES_pacIdentificacion`),
  INDEX `fk_CITAS_CONSULTORIOS_idx` (`CONSULTORIOS_conNumero` ASC) VISIBLE,
  INDEX `fk_CITAS_MEDICOS1_idx` (`MEDICOS_medIdentificacion` ASC) VISIBLE,
  INDEX `fk_CITAS_PACIENTES1_idx` (`PACIENTES_pacIdentificacion` ASC) VISIBLE,
  CONSTRAINT `fk_CITAS_CONSULTORIOS`
    FOREIGN KEY (`CONSULTORIOS_conNumero`)
    REFERENCES `CitasMedicasBD`.`CONSULTORIOS` (`conNumero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CITAS_MEDICOS1`
    FOREIGN KEY (`MEDICOS_medIdentificacion`)
    REFERENCES `CitasMedicasBD`.`MEDICOS` (`medIdentificacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CITAS_PACIENTES1`
    FOREIGN KEY (`PACIENTES_pacIdentificacion`)
    REFERENCES `CitasMedicasBD`.`PACIENTES` (`pacIdentificacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
