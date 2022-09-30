TYPE=VIEW
query=select sum(`bdclick5`.`bdegreso`.`total`) AS `SumaDetotal`,`bdclick5`.`bdegreso`.`fecha` AS `fecha`,`bdclick5`.`bdegreso`.`anulada` AS `anulada`,count(`bdclick5`.`bdegreso`.`total`) AS `contGastos` from `bdclick5`.`bdegreso` where (`bdclick5`.`bdegreso`.`estado` = \'PENDIENTE\') group by `bdclick5`.`bdegreso`.`fecha`,`bdclick5`.`bdegreso`.`anulada` having (`bdclick5`.`bdegreso`.`anulada` = 0)
md5=b1f7e62b36b06556f52b85b6e2746859
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=select sum(`bdegreso`.`total`) AS `SumaDetotal`,`bdegreso`.`fecha` AS `fecha`,`bdegreso`.`anulada` AS `anulada`,count(`bdegreso`.`total`) AS `contGastos` from `bdegreso` where (`bdegreso`.`estado` = \'PENDIENTE\') group by `bdegreso`.`fecha`,`bdegreso`.`anulada` having (`bdegreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select sum(`bdclick5`.`bdegreso`.`total`) AS `SumaDetotal`,`bdclick5`.`bdegreso`.`fecha` AS `fecha`,`bdclick5`.`bdegreso`.`anulada` AS `anulada`,count(`bdclick5`.`bdegreso`.`total`) AS `contGastos` from `bdclick5`.`bdegreso` where (`bdclick5`.`bdegreso`.`estado` = \'PENDIENTE\') group by `bdclick5`.`bdegreso`.`fecha`,`bdclick5`.`bdegreso`.`anulada` having (`bdclick5`.`bdegreso`.`anulada` = 0)
mariadb-version=100135
