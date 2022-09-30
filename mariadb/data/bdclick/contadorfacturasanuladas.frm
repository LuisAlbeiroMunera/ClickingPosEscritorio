TYPE=VIEW
query=select count(`bdclick`.`bdfactura`.`anulada`) AS `contAnuladas`,`bdclick`.`bdfactura`.`anulada` AS `anulada`,`bdclick`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdclick`.`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdclick`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick`.`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdclick`.`bdfactura` group by `bdclick`.`bdfactura`.`anulada`,`bdclick`.`bdfactura`.`fechaAnulacion`,`bdclick`.`bdfactura`.`cuadreAnulacion`,`bdclick`.`bdfactura`.`usuarioAnula` having ((`bdclick`.`bdfactura`.`anulada` = 1) and (`bdclick`.`bdfactura`.`cuadreAnulacion` = \'\'))
md5=4b15c69421c4ebcb96b0540135441ebe
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=select count(`bdfactura`.`anulada`) AS `contAnuladas`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdfactura` group by `bdfactura`.`anulada`,`bdfactura`.`fechaAnulacion`,`bdfactura`.`cuadreAnulacion`,`bdfactura`.`usuarioAnula` having ((`bdfactura`.`anulada` = 1) and (`bdfactura`.`cuadreAnulacion` = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select count(`bdclick`.`bdfactura`.`anulada`) AS `contAnuladas`,`bdclick`.`bdfactura`.`anulada` AS `anulada`,`bdclick`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdclick`.`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdclick`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick`.`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdclick`.`bdfactura` group by `bdclick`.`bdfactura`.`anulada`,`bdclick`.`bdfactura`.`fechaAnulacion`,`bdclick`.`bdfactura`.`cuadreAnulacion`,`bdclick`.`bdfactura`.`usuarioAnula` having ((`bdclick`.`bdfactura`.`anulada` = 1) and (`bdclick`.`bdfactura`.`cuadreAnulacion` = \'\'))
mariadb-version=100135
