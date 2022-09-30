TYPE=VIEW
query=(select `bdclick3`.`bdcompra`.`producto` AS `producto`,sum(`bdclick3`.`bdcompra`.`cantidad`) AS `cant`,`bdclick3`.`bdingreso`.`anulada` AS `anulada`,month(`bdclick3`.`bdingreso`.`fechaFactura`) AS `mes`,year(`bdclick3`.`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdclick3`.`bdcompra`.`subtotal`) AS `total`,sum(`bdclick3`.`bdcompra`.`total`) AS `totalSimplificado` from (`bdclick3`.`bdingreso` left join `bdclick3`.`bdcompra` on((`bdclick3`.`bdcompra`.`ingreso` = `bdclick3`.`bdingreso`.`id`))) group by `bdclick3`.`bdcompra`.`producto`,`bdclick3`.`bdingreso`.`anulada`,month(`bdclick3`.`bdingreso`.`fechaFactura`),year(`bdclick3`.`bdingreso`.`fechaFactura`) having (`bdclick3`.`bdingreso`.`anulada` = 0))
md5=7a79c0f2011bf95ce39b6753b79542fc
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:48
create-version=2
source=(select `bdcompra`.`producto` AS `producto`,sum(`bdcompra`.`cantidad`) AS `cant`,`bdingreso`.`anulada` AS `anulada`,month(`bdingreso`.`fechaFactura`) AS `mes`,year(`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdcompra`.`subtotal`) AS `total`,sum(`bdcompra`.`total`) AS `totalSimplificado` from (`bdingreso` left join `bdcompra` on((`bdcompra`.`ingreso` = `bdingreso`.`id`))) group by `bdcompra`.`producto`,`bdingreso`.`anulada`,month(`bdingreso`.`fechaFactura`),year(`bdingreso`.`fechaFactura`) having (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdcompra`.`producto` AS `producto`,sum(`bdclick3`.`bdcompra`.`cantidad`) AS `cant`,`bdclick3`.`bdingreso`.`anulada` AS `anulada`,month(`bdclick3`.`bdingreso`.`fechaFactura`) AS `mes`,year(`bdclick3`.`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdclick3`.`bdcompra`.`subtotal`) AS `total`,sum(`bdclick3`.`bdcompra`.`total`) AS `totalSimplificado` from (`bdclick3`.`bdingreso` left join `bdclick3`.`bdcompra` on((`bdclick3`.`bdcompra`.`ingreso` = `bdclick3`.`bdingreso`.`id`))) group by `bdclick3`.`bdcompra`.`producto`,`bdclick3`.`bdingreso`.`anulada`,month(`bdclick3`.`bdingreso`.`fechaFactura`),year(`bdclick3`.`bdingreso`.`fechaFactura`) having (`bdclick3`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
