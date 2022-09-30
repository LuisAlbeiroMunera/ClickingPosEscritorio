TYPE=VIEW
query=select count(`bdclick5`.`bdfactura`.`anulada`) AS `contAnuladas`,`bdclick5`.`bdfactura`.`anulada` AS `anulada`,`bdclick5`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdclick5`.`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdclick5`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick5`.`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdclick5`.`bdfactura` group by `bdclick5`.`bdfactura`.`anulada`,`bdclick5`.`bdfactura`.`fechaAnulacion`,`bdclick5`.`bdfactura`.`cuadreAnulacion`,`bdclick5`.`bdfactura`.`usuarioAnula` having ((`bdclick5`.`bdfactura`.`anulada` = 1) and (`bdclick5`.`bdfactura`.`cuadreAnulacion` = \'\'))
md5=cc1d6d31ec1359e7cea2140442591a3f
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=select count(`bdfactura`.`anulada`) AS `contAnuladas`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdfactura` group by `bdfactura`.`anulada`,`bdfactura`.`fechaAnulacion`,`bdfactura`.`cuadreAnulacion`,`bdfactura`.`usuarioAnula` having ((`bdfactura`.`anulada` = 1) and (`bdfactura`.`cuadreAnulacion` = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select count(`bdclick5`.`bdfactura`.`anulada`) AS `contAnuladas`,`bdclick5`.`bdfactura`.`anulada` AS `anulada`,`bdclick5`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdclick5`.`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdclick5`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick5`.`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdclick5`.`bdfactura` group by `bdclick5`.`bdfactura`.`anulada`,`bdclick5`.`bdfactura`.`fechaAnulacion`,`bdclick5`.`bdfactura`.`cuadreAnulacion`,`bdclick5`.`bdfactura`.`usuarioAnula` having ((`bdclick5`.`bdfactura`.`anulada` = 1) and (`bdclick5`.`bdfactura`.`cuadreAnulacion` = \'\'))
mariadb-version=100135
