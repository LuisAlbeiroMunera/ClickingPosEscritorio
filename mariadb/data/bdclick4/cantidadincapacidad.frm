TYPE=VIEW
query=select `bdclick4`.`incapacidad`.`consulta` AS `consulta`,count(`bdclick4`.`incapacidad`.`Id`) AS `cantidadIncapacidad` from `bdclick4`.`incapacidad` group by `bdclick4`.`incapacidad`.`consulta`
md5=4880cc81d296da582de11c4a405ad450
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=select `incapacidad`.`consulta` AS `consulta`,count(`incapacidad`.`Id`) AS `cantidadIncapacidad` from `incapacidad` group by `incapacidad`.`consulta`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`incapacidad`.`consulta` AS `consulta`,count(`bdclick4`.`incapacidad`.`Id`) AS `cantidadIncapacidad` from `bdclick4`.`incapacidad` group by `bdclick4`.`incapacidad`.`consulta`
mariadb-version=100135