TYPE=VIEW
query=(select `bdclick6`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick6`.`bdplansepare`.`producto` AS `producto`,`bdclick6`.`bdplansepare`.`lista` AS `lista`,`bdclick6`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick6`.`bdplansepare`.`anulada` AS `anulada`,`bdclick6`.`bdplansepare`.`estado2` AS `estado2`,`bdclick6`.`bdplansepare`.`bodega` AS `bodega` from `bdclick6`.`bdplansepare` where ((`bdclick6`.`bdplansepare`.`anulada` = 0) and (`bdclick6`.`bdplansepare`.`estado2` = \'\')))
md5=2d17d2be8fb412e0a965260196e643cd
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:37
create-version=2
source=(select `bdplansepare`.`idFactura` AS `idFactura`,`bdplansepare`.`producto` AS `producto`,`bdplansepare`.`lista` AS `lista`,`bdplansepare`.`cantidad` AS `cantidad`,`bdplansepare`.`anulada` AS `anulada`,`bdplansepare`.`estado2` AS `estado2`,`bdplansepare`.`bodega` AS `bodega` from `bdplansepare` where ((`bdplansepare`.`anulada` = 0) and (`bdplansepare`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick6`.`bdplansepare`.`producto` AS `producto`,`bdclick6`.`bdplansepare`.`lista` AS `lista`,`bdclick6`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick6`.`bdplansepare`.`anulada` AS `anulada`,`bdclick6`.`bdplansepare`.`estado2` AS `estado2`,`bdclick6`.`bdplansepare`.`bodega` AS `bodega` from `bdclick6`.`bdplansepare` where ((`bdclick6`.`bdplansepare`.`anulada` = 0) and (`bdclick6`.`bdplansepare`.`estado2` = \'\')))
mariadb-version=100135
