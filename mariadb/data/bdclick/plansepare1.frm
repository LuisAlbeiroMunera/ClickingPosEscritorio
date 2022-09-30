TYPE=VIEW
query=(select `bdclick`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick`.`bdplansepare`.`producto` AS `producto`,`bdclick`.`bdplansepare`.`lista` AS `lista`,`bdclick`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick`.`bdplansepare`.`anulada` AS `anulada`,`bdclick`.`bdplansepare`.`estado2` AS `estado2`,`bdclick`.`bdplansepare`.`bodega` AS `bodega` from `bdclick`.`bdplansepare` where ((`bdclick`.`bdplansepare`.`anulada` = 0) and (`bdclick`.`bdplansepare`.`estado2` = \'\')))
md5=72d3cbc398c419dd6181211b9454930d
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:25
create-version=2
source=(select `bdplansepare`.`idFactura` AS `idFactura`,`bdplansepare`.`producto` AS `producto`,`bdplansepare`.`lista` AS `lista`,`bdplansepare`.`cantidad` AS `cantidad`,`bdplansepare`.`anulada` AS `anulada`,`bdplansepare`.`estado2` AS `estado2`,`bdplansepare`.`bodega` AS `bodega` from `bdplansepare` where ((`bdplansepare`.`anulada` = 0) and (`bdplansepare`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick`.`bdplansepare`.`producto` AS `producto`,`bdclick`.`bdplansepare`.`lista` AS `lista`,`bdclick`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick`.`bdplansepare`.`anulada` AS `anulada`,`bdclick`.`bdplansepare`.`estado2` AS `estado2`,`bdclick`.`bdplansepare`.`bodega` AS `bodega` from `bdclick`.`bdplansepare` where ((`bdclick`.`bdplansepare`.`anulada` = 0) and (`bdclick`.`bdplansepare`.`estado2` = \'\')))
mariadb-version=100135
