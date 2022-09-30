TYPE=VIEW
query=(select `bdclick4`.`bdcompra`.`producto` AS `producto`,sum(`bdclick4`.`bdcompra`.`cantidad`) AS `cant`,`bdclick4`.`bdingreso`.`anulada` AS `anulada`,month(`bdclick4`.`bdingreso`.`fechaFactura`) AS `mes`,year(`bdclick4`.`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdclick4`.`bdcompra`.`subtotal`) AS `total`,sum(`bdclick4`.`bdcompra`.`total`) AS `totalSimplificado` from (`bdclick4`.`bdingreso` left join `bdclick4`.`bdcompra` on((`bdclick4`.`bdcompra`.`ingreso` = `bdclick4`.`bdingreso`.`id`))) group by `bdclick4`.`bdcompra`.`producto`,`bdclick4`.`bdingreso`.`anulada`,month(`bdclick4`.`bdingreso`.`fechaFactura`),year(`bdclick4`.`bdingreso`.`fechaFactura`) having (`bdclick4`.`bdingreso`.`anulada` = 0))
md5=34f9babcd65c435c6c0923d4d6f066e1
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=(select `bdcompra`.`producto` AS `producto`,sum(`bdcompra`.`cantidad`) AS `cant`,`bdingreso`.`anulada` AS `anulada`,month(`bdingreso`.`fechaFactura`) AS `mes`,year(`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdcompra`.`subtotal`) AS `total`,sum(`bdcompra`.`total`) AS `totalSimplificado` from (`bdingreso` left join `bdcompra` on((`bdcompra`.`ingreso` = `bdingreso`.`id`))) group by `bdcompra`.`producto`,`bdingreso`.`anulada`,month(`bdingreso`.`fechaFactura`),year(`bdingreso`.`fechaFactura`) having (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdcompra`.`producto` AS `producto`,sum(`bdclick4`.`bdcompra`.`cantidad`) AS `cant`,`bdclick4`.`bdingreso`.`anulada` AS `anulada`,month(`bdclick4`.`bdingreso`.`fechaFactura`) AS `mes`,year(`bdclick4`.`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdclick4`.`bdcompra`.`subtotal`) AS `total`,sum(`bdclick4`.`bdcompra`.`total`) AS `totalSimplificado` from (`bdclick4`.`bdingreso` left join `bdclick4`.`bdcompra` on((`bdclick4`.`bdcompra`.`ingreso` = `bdclick4`.`bdingreso`.`id`))) group by `bdclick4`.`bdcompra`.`producto`,`bdclick4`.`bdingreso`.`anulada`,month(`bdclick4`.`bdingreso`.`fechaFactura`),year(`bdclick4`.`bdingreso`.`fechaFactura`) having (`bdclick4`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
