TYPE=VIEW
query=(select `bdclick5`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick5`.`bdayudadiagnostica`.`historia` AS `historia`,`bdclick5`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick5`.`bdayudadiagnostica`.`observaciones` AS `observaciones` from `bdclick5`.`bdayudadiagnostica`)
md5=eeb3041dd55e74414fa8456edaead8dc
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=(select `bdayudadiagnostica`.`Id` AS `Id`,`bdayudadiagnostica`.`historia` AS `historia`,`bdayudadiagnostica`.`fecha` AS `fecha`,`bdayudadiagnostica`.`observaciones` AS `observaciones` from `bdayudadiagnostica`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick5`.`bdayudadiagnostica`.`historia` AS `historia`,`bdclick5`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick5`.`bdayudadiagnostica`.`observaciones` AS `observaciones` from `bdclick5`.`bdayudadiagnostica`)
mariadb-version=100135
