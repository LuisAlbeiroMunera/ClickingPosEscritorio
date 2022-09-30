ALTER TABLE paises MODIFY Codigo VARCHAR(3);
ALTER TABLE paises ADD COLUMN cdIso VARCHAR(10);
INSERT INTO paises VALUES ('169','COLOMBIA','CO');
INSERT INTO paises VALUES ('580','Panamá','PA');
ALTER TABLE bdRegiones ADD COLUMN codigoPais VARCHAR(3)  AFTER Id;
UPDATE bdRegiones SET codigoPais = '169';
INSERT INTO bdregiones (codigoPais, nombreDepartamento, codigoDepartamento, nombreMunicipio, codigoMunicipio) VALUES ('580','CIUDAD DE PANAMA','01', 'CIUDAD DE PANAMA','01');
INSERT INTO paises VALUES ('493','MÉXICO','MX');
INSERT INTO bdregiones (codigoPais, nombreDepartamento, codigoDepartamento, nombreMunicipio, codigoMunicipio) VALUES ('493','CIUDAD DE MÉXICO','001', 'CIUDAD DE MÉXICO','001');