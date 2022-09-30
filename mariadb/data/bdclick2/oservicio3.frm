TYPE=VIEW
query=(select `bdclick2`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick2`.`bdoservicio1`.`producto` AS `producto`,`bdclick2`.`bdoservicio1`.`lista` AS `lista`,`bdclick2`.`bdoservicio1`.`cantidad` AS `cantidad`,`bdclick2`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick2`.`bdoservicio1`.`estado2` AS `estado2`,`bdclick2`.`bdoservicio1`.`bodega` AS `bodega` from `bdclick2`.`bdoservicio1` where ((`bdclick2`.`bdoservicio1`.`anulada` = 0) and (`bdclick2`.`bdoservicio1`.`estado2` = \'\')))
md5=e7bc7294dd4d23b75aff69a966cb928e
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:46
create-version=2
source=(select `bdoservicio1`.`idFactura` AS `idFactura`,`bdoservicio1`.`producto` AS `producto`,`bdoservicio1`.`lista` AS `lista`,`bdoservicio1`.`cantidad` AS `cantidad`,`bdoservicio1`.`anulada` AS `anulada`,`bdoservicio1`.`estado2` AS `estado2`,`bdoservicio1`.`bodega` AS `bodega` from `bdoservicio1` where ((`bdoservicio1`.`anulada` = 0) and (`bdoservicio1`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick2`.`bdoservicio1`.`producto` AS `producto`,`bdclick2`.`bdoservicio1`.`lista` AS `lista`,`bdclick2`.`bdoservicio1`.`cantidad` AS `cantidad`,`bdclick2`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick2`.`bdoservicio1`.`estado2` AS `estado2`,`bdclick2`.`bdoservicio1`.`bodega` AS `bodega` from `bdclick2`.`bdoservicio1` where ((`bdclick2`.`bdoservicio1`.`anulada` = 0) and (`bdclick2`.`bdoservicio1`.`estado2` = \'\')))
mariadb-version=100135
