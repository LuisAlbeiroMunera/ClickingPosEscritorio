TYPE=VIEW
query=(select `bdclick3`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick3`.`bdayudadiagnostica`.`historia` AS `historia`,`bdclick3`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick3`.`bdayudadiagnostica`.`observaciones` AS `observaciones` from `bdclick3`.`bdayudadiagnostica`)
md5=5bda934610754e229d39810040437a63
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:48
create-version=2
source=(select `bdayudadiagnostica`.`Id` AS `Id`,`bdayudadiagnostica`.`historia` AS `historia`,`bdayudadiagnostica`.`fecha` AS `fecha`,`bdayudadiagnostica`.`observaciones` AS `observaciones` from `bdayudadiagnostica`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick3`.`bdayudadiagnostica`.`historia` AS `historia`,`bdclick3`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick3`.`bdayudadiagnostica`.`observaciones` AS `observaciones` from `bdclick3`.`bdayudadiagnostica`)
mariadb-version=100135
