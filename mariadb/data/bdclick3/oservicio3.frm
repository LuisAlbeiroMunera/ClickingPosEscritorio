TYPE=VIEW
query=(select `bdclick3`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick3`.`bdoservicio1`.`producto` AS `producto`,`bdclick3`.`bdoservicio1`.`lista` AS `lista`,`bdclick3`.`bdoservicio1`.`cantidad` AS `cantidad`,`bdclick3`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick3`.`bdoservicio1`.`estado2` AS `estado2`,`bdclick3`.`bdoservicio1`.`bodega` AS `bodega` from `bdclick3`.`bdoservicio1` where ((`bdclick3`.`bdoservicio1`.`anulada` = 0) and (`bdclick3`.`bdoservicio1`.`estado2` = \'\')))
md5=ec2ba2fbbf15381be003a97219e101bb
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:52
create-version=2
source=(select `bdoservicio1`.`idFactura` AS `idFactura`,`bdoservicio1`.`producto` AS `producto`,`bdoservicio1`.`lista` AS `lista`,`bdoservicio1`.`cantidad` AS `cantidad`,`bdoservicio1`.`anulada` AS `anulada`,`bdoservicio1`.`estado2` AS `estado2`,`bdoservicio1`.`bodega` AS `bodega` from `bdoservicio1` where ((`bdoservicio1`.`anulada` = 0) and (`bdoservicio1`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick3`.`bdoservicio1`.`producto` AS `producto`,`bdclick3`.`bdoservicio1`.`lista` AS `lista`,`bdclick3`.`bdoservicio1`.`cantidad` AS `cantidad`,`bdclick3`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick3`.`bdoservicio1`.`estado2` AS `estado2`,`bdclick3`.`bdoservicio1`.`bodega` AS `bodega` from `bdclick3`.`bdoservicio1` where ((`bdclick3`.`bdoservicio1`.`anulada` = 0) and (`bdclick3`.`bdoservicio1`.`estado2` = \'\')))
mariadb-version=100135
