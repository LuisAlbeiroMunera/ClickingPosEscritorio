TYPE=VIEW
query=(select `bdclick1`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick1`.`bdayudadiagnostica`.`historia` AS `historia`,`bdclick1`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick1`.`bdayudadiagnostica`.`observaciones` AS `observaciones` from `bdclick1`.`bdayudadiagnostica`)
md5=1b266412fa80223428cc6a50c083c129
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=(select `bdayudadiagnostica`.`Id` AS `Id`,`bdayudadiagnostica`.`historia` AS `historia`,`bdayudadiagnostica`.`fecha` AS `fecha`,`bdayudadiagnostica`.`observaciones` AS `observaciones` from `bdayudadiagnostica`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick1`.`bdayudadiagnostica`.`historia` AS `historia`,`bdclick1`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick1`.`bdayudadiagnostica`.`observaciones` AS `observaciones` from `bdclick1`.`bdayudadiagnostica`)
mariadb-version=100135